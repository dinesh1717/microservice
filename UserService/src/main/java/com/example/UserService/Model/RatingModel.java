package com.example.UserService.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RatingModel {

    private int ratingId;
    private int userId;
    private int hotelId;
    private int rating;
    private String feedBack;
}
