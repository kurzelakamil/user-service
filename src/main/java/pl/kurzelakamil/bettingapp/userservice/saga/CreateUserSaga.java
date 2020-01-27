package pl.kurzelakamil.bettingapp.userservice.saga;

import javax.transaction.Transactional;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;

import pl.kurzelakamil.bettingapp.userservice.dto.transfer.ApproveUserTransferObject;
import pl.kurzelakamil.bettingapp.userservice.dto.transfer.CheckUserTransferObject;
import pl.kurzelakamil.bettingapp.userservice.dto.transfer.RejectUserTransferObject;
import pl.kurzelakamil.bettingapp.userservice.exception.UserNotFoundException;
import pl.kurzelakamil.bettingapp.userservice.model.User;
import pl.kurzelakamil.bettingapp.userservice.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@EnableBinding(CreateUserSagaChannel.class)
@Slf4j
@AllArgsConstructor
public class CreateUserSaga {

    private UserRepository userRepository;
    private CreateUserSagaChannel sagaChannel;

    @SendTo(CreateUserSagaChannel.CHECK_USER)
    public void checkUser(User user, String password){
        log.info("CreateUserSaga start");
        CheckUserTransferObject transferObject = new CheckUserTransferObject(user.getId(), user.getEmail(), password);
        Message<CheckUserTransferObject> message = MessageBuilder.withPayload(transferObject).build();
        sagaChannel.checkUser().send(message);
    }

    @Transactional
    @StreamListener(CreateUserSagaChannel.APPROVE_USER)
    public void approveUser(ApproveUserTransferObject transferObject){
        Long userId = transferObject.getId();
        User user = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
        user.approveUser();
        userRepository.save(user);
    }

    @Transactional
    @StreamListener(CreateUserSagaChannel.REJECT_USER)
    public void rejectUser(RejectUserTransferObject transferObject){
        Long userId = transferObject.getId();
        User user = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
        user.rejectUser();
        userRepository.save(user);
    }
}
