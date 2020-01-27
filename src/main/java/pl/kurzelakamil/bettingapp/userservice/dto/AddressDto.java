package pl.kurzelakamil.bettingapp.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

    private String street;
    private String houseNo;
    private String flatNo;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
