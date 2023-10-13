package com.example.UserService.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="userDetails")
@Data
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    private String name;
    private String email;
    private String about;
    
}
