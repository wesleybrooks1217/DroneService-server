package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.PilotsClass;
import com.codebrewers.mainbackend.service.PilotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/pilots")
public class PilotsController {

    @Autowired
    private PilotsService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/pilots/all
     * @return All pilots in the DB
     */
    @GetMapping(path = "/all")
    public List<PilotsClass> getAllPilotsController() {
        return service.findAllPilots();
    }

    @PostMapping(path = "/add")
    public void postNewPilot(@RequestBody PilotsClass newPilot) {
        service.addPilotRole(newPilot);
    }
    @PostMapping(path = "/remove")
    public void deletePilot(@RequestBody PilotsClass newPilot) {
        service.removePilotRole(newPilot);
    }
}
