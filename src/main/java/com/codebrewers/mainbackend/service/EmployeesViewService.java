package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.views.EmployeesView;
import com.codebrewers.mainbackend.repository.EmployeesViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class EmployeesViewService {

    @Autowired
    private EmployeesViewRepository employeeViewRepository;

    /**
     * Service to find all employee in the DB.
     * @return All employee in the DB.
     */
    public List<EmployeesView> displayAllEmployees() {
        return employeeViewRepository.getAllEmployees();
    }
}
