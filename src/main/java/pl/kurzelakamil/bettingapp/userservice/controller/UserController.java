package pl.kurzelakamil.bettingapp.userservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pl.kurzelakamil.bettingapp.userservice.dto.CreateUserDto;
import pl.kurzelakamil.bettingapp.userservice.model.User;
import pl.kurzelakamil.bettingapp.userservice.service.UserService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@AllArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public User createUser (@RequestBody CreateUserDto createUserDto){
        log.info("Request to create user: {}", createUserDto);
        return userService.createUser(createUserDto);
    }
}
