package com.codebrewers.mainbackend.views;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Data
@Table(name = "display_employee_view")
public class EmployeesView {
    @Id
    private String username;
    private String taxID;
    private Integer salary;
    private Date hired;
    private Integer employee_experience;
    private String licenseID;
    private String piloting_experience;
    private String manager_status;
}
