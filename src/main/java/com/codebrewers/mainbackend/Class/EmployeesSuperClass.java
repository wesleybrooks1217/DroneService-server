package com.codebrewers.mainbackend.Class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDate;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Data
public class EmployeesSuperClass {
    @Id
    private String ip_username;
    private String ip_first_name;
    private String ip_last_name;
    private String ip_address;
    private LocalDate ip_birthdate;
    private String ip_taxID;
    private LocalDate ip_hired;
    private Integer ip_employee_experience;
    private Integer ip_salary;

}
