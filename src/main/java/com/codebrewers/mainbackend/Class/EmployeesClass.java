package com.codebrewers.mainbackend.Class;
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
@Table(name = "employees")
public class EmployeesClass {
    @Id
    private String username;
    private String taxID;
    private Date hired;
    private Integer experience;
    private Integer salary;

    public String getUsername() {
        return username;
    }

}
