package com.example.RatingService.repository;

import com.example.RatingService.model.RatingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<RatingModel, Integer> {

    List<RatingModel>  findByUserId(int UserId);
}
