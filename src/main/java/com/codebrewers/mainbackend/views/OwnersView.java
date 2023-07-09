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
@Table(name = "display_owner_view")
public class OwnersView {
    @Id
    private String username;
    private String first_name;
    private String last_name;
    private String address;
    private Integer num_restaurants;
    private Integer places;
    private Integer highs;
    private Integer lows;
    private Integer debt;
}
