package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.RestaurantsClass;
import com.codebrewers.mainbackend.service.RestaurantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/restaurants")
public class RestaurantsController {

    @Autowired
    private RestaurantsService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/restaurants/all
     * @return All restaurants in the DB
     */
    @GetMapping(path = "/all")
    public List<RestaurantsClass> getAllRestaurantsController() {
        return service.findAllRestaurants();
    }

    @PostMapping(path = "/add")
    public void postNewRestaurant(@RequestBody RestaurantsClass newRestaurant) {
        service.addRestaurant(newRestaurant);
    }

    @PostMapping(path = "/funding")
    public void addFunding(@RequestBody RestaurantsClass newRestaurant) {
        service.addFunding(newRestaurant);
    }
}
