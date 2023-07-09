package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.EmployeesClass;
import com.codebrewers.mainbackend.Class.EmployeesSuperClass;
import com.codebrewers.mainbackend.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class EmployeesSuperService {

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
    public void addEmployee(EmployeesSuperClass newEmployee) {
        entityManager.createNativeQuery("call add_employee (?,?,?,?,?,?,?,?, ?);")
                .setParameter(1, newEmployee.getIp_username())
                .setParameter(2, newEmployee.getIp_first_name())
                .setParameter(3, newEmployee.getIp_last_name())
                .setParameter(4, newEmployee.getIp_address())
                .setParameter(5, newEmployee.getIp_birthdate())
                .setParameter(6, newEmployee.getIp_taxID())
                .setParameter(7, newEmployee.getIp_hired())
                .setParameter(8, newEmployee.getIp_employee_experience())
                .setParameter(9, newEmployee.getIp_salary())
                .executeUpdate();
    }
}
