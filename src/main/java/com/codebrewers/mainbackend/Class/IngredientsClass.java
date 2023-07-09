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
@Table(name = "ingredients")
public class IngredientsClass {
    @Id
    private String barcode;
    private String iname;
    private Integer weight;

    public String getIngredientBarcode() {
        return barcode;
    }

}
