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
public class Address {

    private String street;
    private String houseNo;
    private String flatNo;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
