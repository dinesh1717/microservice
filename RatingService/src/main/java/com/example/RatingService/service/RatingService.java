package com.example.RatingService.service;

import com.example.RatingService.model.RatingModel;

import java.util.List;
import java.util.Optional;

public interface RatingService {

    //create
    public RatingModel createRating(RatingModel ratingModel);

    //getAll
    public List<RatingModel> getAll();
    //getById
    public Optional<RatingModel> getById(int id);
    //updateById
    public RatingModel updateById(RatingModel ratingModel,int id);

    //deleteById
    public void deleteById(int id);
    List<RatingModel> getByUserId(int UserId);
}
