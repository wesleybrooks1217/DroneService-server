package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.WorkersClass;
import com.codebrewers.mainbackend.service.WorkersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/workers")
public class WorkersController {

    @Autowired
    private WorkersService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/workers/all
     * @return All workers in the DB
     */
    @GetMapping(path = "/all")
    public List<WorkersClass> getAllWorkersController() {
        return service.findAllWorkers();
    }

    @PostMapping(path = "/add")
    public void postNewWorker(@RequestBody WorkersClass newWorker) {
        service.addWorker(newWorker);
    }
}
