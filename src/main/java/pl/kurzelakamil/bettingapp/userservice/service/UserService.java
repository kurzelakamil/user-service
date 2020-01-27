package pl.kurzelakamil.bettingapp.userservice.service;

import javax.transaction.Transactional;

import org.mapstruct.factory.Mappers;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import pl.kurzelakamil.bettingapp.userservice.dto.CreateUserDto;
import pl.kurzelakamil.bettingapp.userservice.mapper.UserDetailsMapper;
import pl.kurzelakamil.bettingapp.userservice.model.User;
import pl.kurzelakamil.bettingapp.userservice.repository.UserRepository;
import pl.kurzelakamil.bettingapp.userservice.saga.CreateUserSaga;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class UserService {

    private static final UserDetailsMapper mapper = Mappers.getMapper(UserDetailsMapper.class);

    private UserRepository userRepository;
    private CreateUserSaga createUserSaga;
    private PasswordEncoder passwordEncoder;

    @Transactional
    public User createUser(CreateUserDto createUserDto){
        User user = mapper.createUserDtoToUserModel(createUserDto);
        String password = passwordEncoder.encode(createUserDto.getPassword());
        user.setStatus(User.UserStatus.PENDING);
        userRepository.save(user);
        log.info("Creating user: " + user.getId());
        createUserSaga.checkUser(user, password);
        return user;
    }
}
