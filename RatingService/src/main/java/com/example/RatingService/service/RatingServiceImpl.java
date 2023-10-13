package com.example.RatingService.service;

import com.example.RatingService.model.RatingModel;
import com.example.RatingService.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public RatingModel createRating(RatingModel ratingModel) {
        return this.ratingRepository.save(ratingModel);
    }

    @Override
    public List<RatingModel> getAll() {
        return this.ratingRepository.findAll() ;
    }

    @Override
    public Optional<RatingModel> getById(int id) {
        return this.ratingRepository.findById(id);
    }

    @Override
    public RatingModel updateById(RatingModel ratingModel, int id) {
        ratingModel.setRatingId(id);
        return this.ratingRepository.save(ratingModel);
    }

    @Override
    public void deleteById(int id) {
        this.ratingRepository.deleteById(id);

    }

    @Override
    public List<RatingModel> getByUserId(int UserId) {
        return this.ratingRepository.findByUserId(UserId);
    }
}
