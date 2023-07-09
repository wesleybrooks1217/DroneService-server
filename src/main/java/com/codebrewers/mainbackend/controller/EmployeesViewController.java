package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.service.EmployeesViewService;
import com.codebrewers.mainbackend.views.EmployeesView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/display_employee_view")
public class EmployeesViewController {

    @Autowired
    private EmployeesViewService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/display_employee_view/all
     * @return All display_employee_view in the DB
     */
    @GetMapping(path = "/all")
    public List<EmployeesView> getEmployeesView() {
        return service.displayAllEmployees();
    }

}
