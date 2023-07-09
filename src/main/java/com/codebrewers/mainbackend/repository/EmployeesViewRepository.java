package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.views.EmployeesView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface EmployeesViewRepository extends JpaRepository<EmployeesView, String> {

    @Query(value = "SELECT * FROM display_employee_view", nativeQuery = true)
    List<EmployeesView> getAllEmployees();

}
