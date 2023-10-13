package com.example.UserService.Mapper;

import com.example.UserService.Dto.HotelDetail;
import com.example.UserService.Model.HotelModel;
import com.example.UserService.Model.RatingModel;
import com.example.UserService.Model.UserModel;

import java.util.Optional;

public class HotelUserRatingMapper {

    public static HotelDetail mapRatingModelAndHotel(RatingModel ratingModel, HotelModel hotelModel){
        return  HotelDetail.builder()
                .hotelId(ratingModel.getHotelId())
                .rating(ratingModel.getRating())
                .feedBack(ratingModel.getFeedBack())
                .location(hotelModel.getLocation())
                .name(hotelModel.getName())
                .userId(ratingModel.getUserId())
                .build();
    }
}
