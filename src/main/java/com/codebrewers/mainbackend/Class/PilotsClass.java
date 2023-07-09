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
@Table(name = "pilots")
public class PilotsClass {
    @Id
    private String username;
    private String licenseID;
    private Integer experience;

    public String getPilotname() {
        return username;
    }

}
