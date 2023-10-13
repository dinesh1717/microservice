package com.example.HotelService.Model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="hotelDetails")
@Data
public class HotelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
}
