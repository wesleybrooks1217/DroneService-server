package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.PayloadClass;
import com.codebrewers.mainbackend.service.PayloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/payload")
public class PayloadController {

    @Autowired
    private PayloadService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/payload/all
     * @return All payload in the DB
     */
    @GetMapping(path = "/all")
    public List<PayloadClass> getAllPayloadController() {
        return service.findAllPayload();
    }

    @PostMapping(path = "/add")
    public void postNewPayload(@RequestBody PayloadClass newPayload) {
        service.loadDrone(newPayload);
    }
}
