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
@Table(name = "drones")
public class DronesClass {
    @Id
    private String id;
    private Integer tag;
    private Integer fuel;
    private Integer capacity;
    private Integer sales;
    private String flown_by;
    private String swarm_id;
    private Integer swarm_tag;
    private String hover;

    public String getDroneId() {
        return id;
    }

}
