package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.EmployeesClass;
import com.codebrewers.mainbackend.Class.Work_forClass;
import com.codebrewers.mainbackend.service.Work_forService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/work_for")
public class Work_forController {

    @Autowired
    private Work_forService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/work_for/all
     * @return All work_for in the DB
     */
    @GetMapping(path = "/all")
    public List<Work_forClass> getAllWork_forController() {
        return service.findAllWork_for();
    }

    @PostMapping(path = "/hire")
    public void postNewEmployee(@RequestBody Work_forClass newWork_for) {
        service.hireNewEmployee(newWork_for);
    }
    @PostMapping(path = "/fire")
    public void removeNewEmployee(@RequestBody Work_forClass newWork_for) {
        service.fireNewEmployee(newWork_for);
    }
}
