package pl.kurzelakamil.bettingapp.userservice.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PhoneNumber {

    private String countryCode;
    private String areaCode;
    private String number;
}
