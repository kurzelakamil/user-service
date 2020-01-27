package pl.kurzelakamil.bettingapp.userservice.model;

import java.time.LocalDate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="user_")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String name;
    private String surname;
    private LocalDate birthDate;

    @AttributeOverrides(
            { @AttributeOverride(name = "countryCode", column = @Column(name = "phone_number_country_code")),
                    @AttributeOverride(name = "areaCode", column = @Column(name = "phone_number_area_code")),
                    @AttributeOverride(name = "number", column = @Column(name = "phone_number_number")) })
    @Embedded
    private PhoneNumber phoneNumber;

    private String nationality;

    private String pesel;

    private String passportNo;

    @AttributeOverrides( { @AttributeOverride(name = "street", column = @Column(name = "address_street")),
                                 @AttributeOverride(name = "houseNo", column = @Column(name = "address_house_no")),
                                 @AttributeOverride(name = "flatNo", column = @Column(name = "address_flat_no")),
                                 @AttributeOverride(name = "city", column = @Column(name = "address_city")),
                                 @AttributeOverride(name = "state", column = @Column(name = "address_state")),
                                 @AttributeOverride(name = "zipCode", column = @Column(name = "address_zip_code")),
                                 @AttributeOverride(name = "country", column = @Column(name = "address_country")) })
    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    public enum UserStatus{
        PENDING,
        APPROVED,
        REJECTED;
    }

    public void approveUser(){
        this.status = UserStatus.APPROVED;
    }

    public void rejectUser(){
        this.status = UserStatus.REJECTED;
    }
}
