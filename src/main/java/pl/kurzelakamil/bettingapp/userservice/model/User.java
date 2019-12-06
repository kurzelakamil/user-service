package pl.kurzelakamil.bettingapp.userservice.model;

import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String name;
    private String surname;
    private LocalDate birthDate;

    @Embedded
    private PhoneNumber phoneNumber;

    @ManyToOne
    @JoinColumn(name = "nationality_id")
    private NationalityDictionary nationality;

    private String pesel;

    private String passportNo;

    @Embedded
    private Address address;
}
