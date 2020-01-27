package pl.kurzelakamil.bettingapp.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PhoneNumberDto {

    private String countryCode;
    private String areaCode;
    private String number;
}
