package com.vamsi.BookMyMotel.repos;


import com.vamsi.BookMyMotel.models.MyUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<MyUsers, Long> {



           Optional<MyUsers> findByEmail(String email);


}
