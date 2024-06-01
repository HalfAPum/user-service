package com.narvatov.user_service.controller;

import com.narvatov.user_service.dto.response.SimpleUserDTO;
import com.narvatov.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class Controller {

//    @Autowired
//    private AuthenticationService authenticationService;
    @Autowired
    private UserService userService;
//
//    @PostMapping("signup")
//    public JwtAuthenticationResponse signUp(@RequestBody SignUp signUp) {
//        return authenticationService.signUp(signUp);
//    }
//
//    @PostMapping("signin")
//    public JwtAuthenticationResponse signIn(@RequestBody SignIn signIn) {
//        return authenticationService.signIn(signIn);
//    }

    @GetMapping("get/{id}")
    public SimpleUserDTO getUser(@PathVariable("id") int id) {
        return userService.get(id);
    }

}

