package pl.kurzelakamil.bettingapp.userservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pl.kurzelakamil.bettingapp.userservice.UserService;
import pl.kurzelakamil.bettingapp.userservice.dto.UserInputDto;

@RestController
public class UserController {

    private UserService userService;

    @PostMapping("/registration")
    public void registerUser(@RequestBody UserInputDto userInputDto){

    }
}
