package com.vamsi.BookMyMotel.services.auth;

import com.vamsi.BookMyMotel.models.MyUsers;
import com.vamsi.BookMyMotel.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        MyUsers user =  userRepo.findByEmail(email).orElseThrow(()->
                new UsernameNotFoundException("Email is not registered!")
                );


        return  user;
    }
}
