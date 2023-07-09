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
@Table(name = "restaurant_owners")
public class Restaurant_ownersClass {
    @Id
    private String username;

    public String getUsername() {
        return username;
    }

}
