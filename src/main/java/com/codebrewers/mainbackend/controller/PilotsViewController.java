package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.service.PilotsViewService;
import com.codebrewers.mainbackend.views.PilotsView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/display_pilot_view")
public class PilotsViewController {

    @Autowired
    private PilotsViewService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/display_pilot_view/all
     * @return All display_pilot_view in the DB
     */
    @GetMapping(path = "/all")
    public List<PilotsView> getPilotsView() {
        return service.displayAllPilots();
    }

}
