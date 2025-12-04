package com.vamsi.BookMyMotel.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hotel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hotel {

    @Id
    @Column(name = "hotel_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "hotelName")
    private String hotelName;

    @Column(name = "hotelCity")
    private String hotelCity;

    @Column(name = "hotelState")
    private String hotelState;

    @Column(name = "hotelStreetAddress" )
    private String hotelStreetAddress;

    @Column(name = "basePrice")
    private Double basePrice;

    @Column(name = "hotelZipcode" )
    private String hotelZipcode;

    @Column(name = "hotelRating" )
    private Double hotelRating;

    @Column(name = "noOfReviews")
    private Integer noOfReviews;

    @Column(name = "totalRooms")
    private Integer totalRooms;

    @Column(name = "hotelDescription")
    private String hotelDescription;

}
