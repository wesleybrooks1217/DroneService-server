package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.EmployeesClass;
import com.codebrewers.mainbackend.Class.EmployeesSuperClass;
import com.codebrewers.mainbackend.service.EmployeesService;
import com.codebrewers.mainbackend.service.EmployeesSuperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/add_employees")
public class EmployeesSuperController {

    @Autowired
    private EmployeesSuperService service;

    /**
     * Controller to get add the employee in the DB.
     * http://localhost:8081/employees/all
     * @return All employees in the DB
     */
    @PostMapping(path = "/add")
    public void postNewEmployee(@RequestBody EmployeesSuperClass newEmployee) {
        service.addEmployee(newEmployee);
    }
}
