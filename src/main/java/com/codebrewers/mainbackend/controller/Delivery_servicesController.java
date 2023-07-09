package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.Delivery_servicesClass;
import com.codebrewers.mainbackend.service.Delivery_servicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/delivery_services")
public class Delivery_servicesController {

    @Autowired
    private Delivery_servicesService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/delivery_services/all
     * @return All delivery_services in the DB
     */
    @GetMapping(path = "/all")
    public List<Delivery_servicesClass> getAllDelivery_servicesController() {
        return service.findAllDelivery_services();
    }

    @PostMapping(path = "/add")
    public void postNewDelivery_service(@RequestBody Delivery_servicesClass newDelivery_service) {
        System.out.println("Hello world");
        service.addService(newDelivery_service);
    }

    @PostMapping(path = "/manage")
    public void postNewManager(@RequestBody Delivery_servicesClass newDelivery_Service) {
        System.out.println("manage");
        service.manageService(newDelivery_Service);
    }
}
