package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.Delivery_servicesClass;
import com.codebrewers.mainbackend.Class.ServiceManageClass;
import com.codebrewers.mainbackend.service.manageServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/manage_service")
public class ServiceManageController {

    @Autowired
    private manageServiceService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/delivery_services/all
     * @return All delivery_services in the DB
     */

    @PostMapping(path = "/manage")
    public void postNewManager(@RequestBody ServiceManageClass newManage) {
        System.out.println("manage");
        service.manageService(newManage);
    }
}
