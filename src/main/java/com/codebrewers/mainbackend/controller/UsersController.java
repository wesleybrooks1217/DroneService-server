package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.UsersClass;
import com.codebrewers.mainbackend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="/users")
public class UsersController {

    @Autowired
    private UsersService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/users/all
     * @return All users in the DB
     */
    @GetMapping(path = "/all")
    public List<UsersClass> getAllUsersController() {
        return service.findAllUsers();
    }

    @PostMapping(path = "/add")
    public void postNewUser(@RequestBody UsersClass newUser) {
        System.out.println(newUser.getBirthdate());
        service.saveUser(newUser);
    }
}
