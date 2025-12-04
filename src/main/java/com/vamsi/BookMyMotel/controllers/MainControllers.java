package com.vamsi.BookMyMotel.controllers;


import com.vamsi.BookMyMotel.models.Hotel;
import com.vamsi.BookMyMotel.repos.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class MainControllers {
    List<Hotel> hotels;


    @Autowired
    HotelRepository hotelRepository;


    @GetMapping
    public List<Hotel> getAllHotels(){
        hotels = hotelRepository.findAll();
        return hotels;

    }

    @PostMapping
    public ResponseEntity<Hotel> addNewHotel(String hotelName, String hotelCity, String hotelState, Double basePrice){

        Hotel h = new Hotel();
        h.setHotelName(hotelName);
        h.setHotelState(hotelState);
        h.setHotelCity(hotelCity);
        h.setBasePrice(basePrice);

        Hotel newHotel = hotelRepository.save(h);

        System.out.println(newHotel);
        return new ResponseEntity<>(HttpStatus.OK);
    }



    @DeleteMapping("/{hotelId}")
    public ResponseEntity<Hotel> deleteHotel(@PathVariable  Integer hotelId){
        hotelRepository.deleteById(hotelId);
        return new ResponseEntity<>(HttpStatus.OK);
    }



    @PutMapping("/{hotelId}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable Integer hotelId,
                                             @RequestBody Hotel hotelRequest
                                             ){


        Hotel hotelToBeUpdated =  hotelRepository.findById(hotelId).orElseThrow(()-> new RuntimeException("Hotel Not found"));

        hotelToBeUpdated.setBasePrice(hotelRequest.getBasePrice());

        Hotel updatedHotel =  hotelRepository.save(hotelToBeUpdated);

        return new ResponseEntity<>(HttpStatus.OK);
    }


}
