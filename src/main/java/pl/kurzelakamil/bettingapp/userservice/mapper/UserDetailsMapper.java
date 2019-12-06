package pl.kurzelakamil.bettingapp.userservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import pl.kurzelakamil.bettingapp.userservice.dto.AddressDto;
import pl.kurzelakamil.bettingapp.userservice.dto.PhoneNumberDto;
import pl.kurzelakamil.bettingapp.userservice.dto.UserInputDto;
import pl.kurzelakamil.bettingapp.userservice.model.Address;
import pl.kurzelakamil.bettingapp.userservice.model.PhoneNumber;
import pl.kurzelakamil.bettingapp.userservice.model.User;

@Mapper
public interface UserDetailsMapper {

    @Mapping(target = "id", ignore = true)
    User userInputDtoToUser(UserInputDto userInputDto);

    PhoneNumber phoneNumberDtoToPhoneNumber(PhoneNumberDto phoneNumberDto);

    Address addressDtoToAddress(AddressDto addressDto);
}
