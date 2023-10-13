package com.example.HotelService.Controller;


import com.example.HotelService.Model.HotelModel;
import com.example.HotelService.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Hotel")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @PostMapping("/create")
    public HotelModel create(@RequestBody HotelModel hotelModel){
        return this.hotelService.createHotel(hotelModel);
    }

    @GetMapping("/getAll")
    public List<HotelModel> getAll(){
        return this.hotelService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<HotelModel> getById(@PathVariable int id){
        return this.hotelService.getById(id);
    }

    @PutMapping("/updateId/{id}")
    public HotelModel updateById(@RequestBody HotelModel hotelModel, @PathVariable int id){
        return this.hotelService.updateById(hotelModel,id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable int id){
       this.hotelService.deleteById(id);
    }


}
