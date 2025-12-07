package com.vamsi.BookMyMotel.services.auth;


import com.vamsi.BookMyMotel.models.MyUsers;
import com.vamsi.BookMyMotel.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserAuthService {


    @Autowired
    private UserRepo userRepo;

    @Autowired
    PasswordEncoder passwordEncoder;



    public MyUsers register(MyUsers myUsers){

        MyUsers userPrincipal =  new MyUsers();

        userPrincipal.setEmail(myUsers.getEmail());
        userPrincipal.setPassword(passwordEncoder.encode(myUsers.getPassword()));

        return userRepo.save(userPrincipal);

    }




}
