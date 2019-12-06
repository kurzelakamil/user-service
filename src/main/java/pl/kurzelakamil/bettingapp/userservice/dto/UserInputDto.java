package pl.kurzelakamil.bettingapp.userservice.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserInputDto {

    private String email;
    private String password;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private PhoneNumberDto phoneNumber;
    private DictionaryDto nationality;
    private String pesel;
    private String passportNo;
    private AddressDto address;
}
