package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.service.ServicesViewService;
import com.codebrewers.mainbackend.views.ServicesView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/display_service_view")
public class ServicesViewController {

    @Autowired
    private ServicesViewService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/display_service_view/all
     * @return All display_service_view in the DB
     */
    @GetMapping(path = "/all")
    public List<ServicesView> getServicesView() {
        return service.displayAllServices();
    }

}
