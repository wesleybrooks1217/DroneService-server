package com.codebrewers.mainbackend.Class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Data
public class ServiceManageClass {
    @Id
    private String username;
    private String id;

    public String getDelivery_serviceID() {
        return id;
    }

}
