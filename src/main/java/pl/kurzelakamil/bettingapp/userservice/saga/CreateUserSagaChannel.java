package pl.kurzelakamil.bettingapp.userservice.saga;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface CreateUserSagaChannel {

    String CHECK_USER = "checkUser";
    String APPROVE_USER = "approveUser";
    String REJECT_USER = "rejectUser";

    @Output
    MessageChannel checkUser();

    @Input
    SubscribableChannel approveUser();

    @Input
    SubscribableChannel rejectUser();
}
