package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.Restaurant_ownersClass;
import com.codebrewers.mainbackend.Class.UsersClass;
import com.codebrewers.mainbackend.service.Restaurant_ownersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/restaurant_owners")
public class Restaurant_ownersController {

    @Autowired
    private Restaurant_ownersService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/restaurant_owners/all
     * @return All restaurant_owners in the DB
     */
    @GetMapping(path = "/all")
    public List<Restaurant_ownersClass> getAllRestaurant_ownersController() {
        return service.findAllRestaurant_owners();
    }

    @PostMapping(path = "/add")
    public void addRestaurantOwnersClass(@RequestBody UsersClass newUser) {
        System.out.println("Controller" + newUser.getUsername() + newUser.getFirst_name()
                + newUser.getLast_name() + newUser.getAddress() + newUser.getBirthdate());
        service.saveRestaurant_owner(newUser);
    }
}
