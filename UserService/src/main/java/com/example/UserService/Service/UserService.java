package com.example.UserService.Service;

import com.example.UserService.Dto.UserDetail;
import com.example.UserService.Model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {

    //create
    public UserModel createUser(UserModel userModel);
    //read
    public List<UserModel> getAll();
    //readId
    public Optional<UserModel> getById(int id);
    //update
    public UserModel updateById(UserModel userModel,int id);
    //delete
    public void deleteById(int id);

    public UserDetail getUserDetailsById(int id);
}
