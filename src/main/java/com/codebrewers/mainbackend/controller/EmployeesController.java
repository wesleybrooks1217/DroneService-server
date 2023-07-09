package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.EmployeesClass;
import com.codebrewers.mainbackend.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/employees")
public class EmployeesController {

    @Autowired
    private EmployeesService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/employees/all
     * @return All employees in the DB
     */
    @GetMapping(path = "/all")
    public List<EmployeesClass> getAllEmployeesController() {
        return service.findAllEmployees();
    }

    @PostMapping(path = "/add")
    public void postNewEmployee(@RequestBody EmployeesClass newEmployee) {
        //service.saveEmployee(newEmployee);
    }

}
