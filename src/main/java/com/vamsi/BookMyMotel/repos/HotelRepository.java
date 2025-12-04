package com.vamsi.BookMyMotel.repos;


import com.vamsi.BookMyMotel.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository  extends JpaRepository<Hotel, Integer> {




}
