package com.example.HotelService.Service;

import com.example.HotelService.Model.HotelModel;
import com.example.HotelService.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class HotelServiceImpl implements HotelService{


    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public HotelModel createHotel(HotelModel hotelModel) {
        return this.hotelRepository.save(hotelModel);
    }

    @Override
    public List<HotelModel> getAll() {
        return this.hotelRepository.findAll() ;
    }

    @Override
    public Optional<HotelModel> getById(int id) {
        return this.hotelRepository.findById(id);
    }


    @Override
    public HotelModel updateById(HotelModel hotelModel, int id) {
        hotelModel.setId(id);
        return this.hotelRepository.save(hotelModel);
    }

    @Override
    public void deleteById(int id) {
        this.hotelRepository.deleteById(id);

    }
}
