package com.example.UserService.Dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDetail {

    private int  userId;
    private String name;
    private String email;
    private String about;
    List<HotelDetail> hotelDetailslist;
}
