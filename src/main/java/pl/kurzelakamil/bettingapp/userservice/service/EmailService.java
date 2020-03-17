package pl.kurzelakamil.bettingapp.userservice.service;

import org.simplejavamail.email.EmailBuilder;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    protected void sendEmailActivation(String email){
        EmailBuilder.startingBlank()
                .to(email)
                .buildEmail();
    }
}
