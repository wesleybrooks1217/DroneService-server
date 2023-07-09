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
@Table(name = "display_pilot_view")
public class PilotsView {
    @Id
    private String username;
    private String licenseID;
    private Integer experience;
    private Integer num_drones;
    private Integer num_locations;
}
