package com.example.UserService.Service;



import com.example.UserService.Model.HotelModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name="HOTEL-SERVICE")
public interface HotelInfoService {

    @GetMapping("/Hotel/getById/{id}")
    HotelModel getHotelInfoById(@PathVariable int id);
}
