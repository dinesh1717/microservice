package com.example.HotelService.Service;

import com.example.HotelService.Model.HotelModel;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    //create
    public HotelModel createHotel(HotelModel hotelModel);

    //get
    public List<HotelModel> getAll();

    //getById
    public Optional<HotelModel> getById(int id);

    //update
    public HotelModel updateById(HotelModel hotelModel,int id);

    //delete
    public void deleteById(int id);
}
