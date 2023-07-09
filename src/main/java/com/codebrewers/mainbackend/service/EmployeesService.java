package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.EmployeesClass;
import com.codebrewers.mainbackend.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class EmployeesService {

    @Autowired
    private EmployeesRepository employeesRepository;

    /**
     * Service to find all employees in the DB.
     * @return All employees in the DB.
     */
    public List<EmployeesClass> findAllEmployees() {
       return employeesRepository.getAllEmployees();
    }
    @PersistenceContext
    private EntityManager entityManager;
}
