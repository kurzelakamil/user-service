package pl.kurzelakamil.bettingapp.userservice.dto.transfer;

import java.time.OffsetDateTime;

import lombok.Getter;

@Getter
public class CheckUserTransferObject {

    private HeaderDto header;
    private Long id;
    private String email;
    private String password;

    public CheckUserTransferObject(Long id, String email, String password){
        this.header = new HeaderDto("user-service", OffsetDateTime.now());
        this.id = id;
        this.email = email;
        this.password = password;
    }
}
