package com.example.RatingService.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="rating")
public class RatingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ratingId;

    private int userId;

    private int hotelId;

    private int rating;

     private String feedBack;
}
