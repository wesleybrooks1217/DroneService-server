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
@Table(name = "locations")
public class LocationsClass {
    @Id
    private String label;
    private Integer x_coord;
    private Integer y_coord;
    private Integer space;

    public String getLocationLabel() {
        return label;
    }

}
