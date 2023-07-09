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
@Table(name = "display_locations_view")
public class LocationsView {
    @Id
    private String label;
    private Integer x_coord;
    private Integer y_coord;
    private Integer num_restaurants;
    private Integer num_delivery_services;
    private Integer num_drones;
}
