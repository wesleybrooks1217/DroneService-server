package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.Class.EmployeesClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesClass, String> {

    @Query(value = "SELECT * FROM employees", nativeQuery = true)
    List<EmployeesClass> getAllEmployees();

    @Query(value = "SELECT count(*) FROM employees WHERE username = ?1", nativeQuery = true)
    int countEmployeesByName(String name);
}
