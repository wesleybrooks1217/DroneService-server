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
@Table(name = "restaurants")
public class RestaurantsClass {
    @Id
    private String long_name;
    private Integer rating;
    private Integer spent;
    private String location;
    private String funded_by;

    public String getRestaurantname() {
        return long_name;
    }

}
