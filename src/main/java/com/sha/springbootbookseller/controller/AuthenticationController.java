package com.sha.springbootbookseller.controller;

import com.sha.springbootbookseller.model.User;
import com.sha.springbootbookseller.service.AuthenticationService;
import com.sha.springbootbookseller.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/authentication")
@Slf4j
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private UserService userService;

    @PostMapping("sign-up")
    public ResponseEntity<User> signUp(@RequestBody User user){
        if (userService.findByUser(user.getUsername()).isPresent())
        {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }
    @PostMapping("sign-in")//api/authentication/sign-in
    public ResponseEntity<?> signIn(@RequestBody User user)
    {
        try{
            return new ResponseEntity<>(authenticationService.signInReturnJWT(user), HttpStatus.OK);
        }
        catch(Exception ex) {
            ex.printStackTrace();
            log.error("unknown error",ex);
        }
        return null;
    }
}
