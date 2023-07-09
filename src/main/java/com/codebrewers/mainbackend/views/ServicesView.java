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
@Table(name = "display_service_view")
public class ServicesView {
    @Id
    private String id;
    private String long_name;
    private String home_base;
    private String manager;
    private Integer revenue;
    private Integer ingredients_carried;
    private Integer cost_carried;
    private Integer weight_carried;
}
