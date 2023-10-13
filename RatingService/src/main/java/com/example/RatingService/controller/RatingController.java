package com.example.RatingService.controller;


import com.example.RatingService.model.RatingModel;
import com.example.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/create")
    public RatingModel create(@RequestBody RatingModel ratingModel){
        return this.ratingService.createRating(ratingModel);
    }

    @GetMapping("getAll")
    public List<RatingModel>getAll(){
        return this.ratingService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<RatingModel> getById(@PathVariable int id){
        return this.ratingService.getById(id);
    }

    @GetMapping("/getByUserId/{UserId}")
    public List<RatingModel> getByUserId(@PathVariable int UserId){
        return this.ratingService.getByUserId(UserId);
    }

    @PutMapping("/updateById/{id}")
    public RatingModel updateById(@RequestBody RatingModel ratingModel, @PathVariable int id){
        return this.ratingService.updateById(ratingModel, id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable int id){
        this.ratingService.deleteById(id);
    }







}
