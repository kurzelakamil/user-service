package pl.kurzelakamil.bettingapp.userservice.service;

import org.mapstruct.factory.Mappers;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import pl.kurzelakamil.bettingapp.userservice.dto.UserInputDto;
import pl.kurzelakamil.bettingapp.userservice.mapper.UserDetailsMapper;
import pl.kurzelakamil.bettingapp.userservice.model.User;
import pl.kurzelakamil.bettingapp.userservice.repository.UserRepository;

@Service
public class UserService {

    private static final UserDetailsMapper MAPPER = Mappers.getMapper(UserDetailsMapper.class);
    private UserRepository userRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void createUser(UserInputDto userInputDto){
        User user = MAPPER.userInputDtoToUser(userInputDto);
        userRepository.save(user);
        String hashedPassword = bCryptPasswordEncoder.encode(userInputDto.getPassword());


        return;
    }
}
