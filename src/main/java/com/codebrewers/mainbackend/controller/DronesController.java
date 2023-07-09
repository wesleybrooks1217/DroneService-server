package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.DronesClass;
import com.codebrewers.mainbackend.Class.UsersClass;
import com.codebrewers.mainbackend.service.DronesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
@RequestMapping(path="/drones")
public class DronesController {

    @Autowired
    private DronesService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/drones/all
     * @return All drones in the DB
     */
    @GetMapping(path = "/all")
    public List<DronesClass> getAllDronesController() {
        return service.findAllDrones();
    }

    @PostMapping(path = "/add")
    public void postNewDrone(@RequestBody DronesClass newDrone) {
        service.addDronesClass(newDrone);
    }

    @PostMapping(path = "/remove")
    public void deleteDrone(@RequestBody DronesClass newDrone) {
        service.removeDrone(newDrone);
    }


    @PostMapping(path = "/takeover")
    public void takeoverDrone(@RequestBody DronesClass newDrone) {
        service.droneTakeover(newDrone);
    }

    @PostMapping(path = "/join_swarm")
    public void addToSwarm(@RequestBody DronesClass newDrone) {
        service.joinSwarm(newDrone);
    }

    @PostMapping(path = "/leave_swarm")
    public void removeFromSwarm(@RequestBody DronesClass newDrone) {
        service.leaveSwarm(newDrone);
    }

    @PostMapping(path = "/refuel")
    public void refuel(@RequestBody DronesClass newDrone) {
        service.refuelDrone(newDrone);
    }
    @PostMapping(path = "/fly")
    public void fly(@RequestBody DronesClass newDrone) {
        service.flyDrone(newDrone);
    }


}
