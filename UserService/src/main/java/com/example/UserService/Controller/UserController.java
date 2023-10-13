package com.example.UserService.Controller;

import com.example.UserService.Dto.UserDetail;
import com.example.UserService.Model.UserModel;
import com.example.UserService.Service.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //create
    @PostMapping("/create")
    public UserModel Create(@RequestBody UserModel userModel){
        return this.userService.createUser(userModel);
    }

    //read
    @GetMapping("/getAll")
    public List<UserModel> getAll(){
        return  this.userService.getAll();
    }
    //read id
    @GetMapping("/getById/{id}")
    public Optional<UserModel> getById(@PathVariable int id){
        return  this.userService.getById(id);
    }


    //update
    @PutMapping("/updateId/{id}")
    public UserModel updateById(@RequestBody UserModel userModel, @PathVariable int id){
        return  this.userService.updateById(userModel,id);
    }
    //delete
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable int id){
        this.userService.deleteById(id);
    }


//    @GetMapping("/getUserHotels/{id}")
//    @CircuitBreaker(name = "ratingHotelBreaker", fallbackMethod = "ratHotelFallBack")
//    public UserDetails getUserRatedHotelsById(@PathVariable int id){
//        return this.userService.getUserDetailsById(id);
//    }
@GetMapping("/getUserId/{id}")
//@CircuitBreaker(name = "ratingHotelBreaker", fallbackMethod = "ratHotelFallBack")
@RateLimiter(name = "userRateLimiter", fallbackMethod = "ratHotelFallBack")
public UserDetail getHotelUserId(@PathVariable int id){
    return this.userService.getUserDetailsById(id);
}
    public UserDetail ratHotelFallBack(int userId, Exception ex){
        return UserDetail.builder()
                .userId(userId)
                .email("dummyUser@test.com")
                .name("dummy name")
                .hotelDetailslist(null)
                .about("This is dummy userDetails created because there is some error on other microservices")
                .build();
    }


}
