package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.LocationsClass;
import com.codebrewers.mainbackend.service.LocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/locations")
public class LocationsController {

    @Autowired
    private LocationsService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/locations/all
     * @return All locations in the DB
     */
    @GetMapping(path = "/all")
    public List<LocationsClass> getAllLocationsController() {
        return service.findAllLocations();
    }

    @PostMapping(path = "/add")
    public void postNewLocation(@RequestBody LocationsClass newLocation) {
        service.addLocation(newLocation);
    }
}
