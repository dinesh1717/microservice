package com.example.HotelService.Repository;

import com.example.HotelService.Model.HotelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<HotelModel,Integer> {
}
