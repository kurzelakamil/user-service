package pl.kurzelakamil.bettingapp.userservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import pl.kurzelakamil.bettingapp.userservice.model.Address;
import pl.kurzelakamil.bettingapp.userservice.model.PhoneNumber;
import pl.kurzelakamil.bettingapp.userservice.dto.AddressDto;
import pl.kurzelakamil.bettingapp.userservice.dto.CreateUserDto;
import pl.kurzelakamil.bettingapp.userservice.dto.PhoneNumberDto;
import pl.kurzelakamil.bettingapp.userservice.model.User;

@Mapper
public interface UserDetailsMapper {

    PhoneNumber phoneNumberDtoToPhoneNumber(PhoneNumberDto phoneNumberDto);

    Address addressDtoToAddress(AddressDto addressDto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "nationality", source = "nationality.label")
    User createUserDtoToUserModel(CreateUserDto createUserDto);
}
