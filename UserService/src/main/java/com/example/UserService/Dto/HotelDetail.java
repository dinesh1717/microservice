package com.example.UserService.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelDetail {
   private int userId;
    private String name;
    private String location;
    private int hotelId;
    private int rating;
    private String feedBack;
}
