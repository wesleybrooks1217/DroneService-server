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
@Table(name = "delivery_services")
public class Delivery_servicesClass {
    @Id
    private String id;
    private String long_name;
    private String home_base;
    private String manager;

    public String getDelivery_serviceID() {
        return id;
    }

}
