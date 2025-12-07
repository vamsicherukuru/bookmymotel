package com.vamsi.BookMyMotel.controllers;


import com.vamsi.BookMyMotel.models.MyUsers;
import com.vamsi.BookMyMotel.services.auth.UserAuthService;
import com.vamsi.BookMyMotel.services.auth.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {




    @Autowired
    private UserAuthService userAuthService;


    @PostMapping("/register")
    public ResponseEntity<MyUsers> register(@RequestBody MyUsers myUsers){


        MyUsers userPrincipal =  userAuthService.register(myUsers);


        return new ResponseEntity<>(HttpStatus.OK);
    }

}
