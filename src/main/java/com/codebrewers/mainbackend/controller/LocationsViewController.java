package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.service.LocationsViewService;
import com.codebrewers.mainbackend.views.LocationsView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/display_location_view")
public class LocationsViewController {

    @Autowired
    private LocationsViewService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/display_location_view/all
     * @return All display_location_view in the DB
     */
    @GetMapping(path = "/all")
    public List<LocationsView> getLocationsView() {
        return service.displayAllLocations();
    }

}
