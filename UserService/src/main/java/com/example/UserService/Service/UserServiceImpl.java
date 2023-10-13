package com.example.UserService.Service;

import com.example.UserService.Dto.HotelDetail;
import com.example.UserService.Dto.UserDetail;
import com.example.UserService.Mapper.HotelUserRatingMapper;
import com.example.UserService.Model.HotelModel;
import com.example.UserService.Model.RatingModel;
import com.example.UserService.Model.UserModel;
import com.example.UserService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HotelInfoService hotelInfoService;

    @Autowired
    private HotelRatingService hotelRatingService;
    @Override
    public UserModel createUser(UserModel userModel) {
        return this.userRepository.save(userModel);
    }

    @Override
    public List<UserModel> getAll() {
        return this.userRepository.findAll();
    }

    @Override
    public Optional<UserModel> getById(int id) {
        return this.userRepository.findById(id);
    }

    @Override
    public UserModel updateById(UserModel userModel, int id) {
        userModel.setId(id);
        return this.userRepository.save(userModel);
    }

    @Override
    public void deleteById(int id) {
     this.userRepository.deleteById(id);
    }

    @Override
    public UserDetail getUserDetailsById(int id) {
        UserDetail userDetail = new UserDetail();
        Optional<UserModel> userModel = this.userRepository.findById(id);
        List<RatingModel> ratingModels = hotelRatingService.getRatingByUserId(id);

        if (userModel != null && ratingModels.size() > 0) {

            List<HotelDetail> hotelDetailsList = new ArrayList<>();

            for (RatingModel ratingModel : ratingModels) {
                HotelModel hotelModel = hotelInfoService.getHotelInfoById(ratingModel.getHotelId());
                hotelDetailsList.add(HotelUserRatingMapper.mapRatingModelAndHotel(ratingModel, hotelModel));
            }

            userDetail = UserDetail.builder()
                    .userId(userModel.get().getId())
                    .name(userModel.get().getName())
                    .about(userModel.get().getAbout())
                    .email(userModel.get().getEmail())
                    .hotelDetailslist(hotelDetailsList)
                    .build();
        }
        return userDetail;
    }
    }



