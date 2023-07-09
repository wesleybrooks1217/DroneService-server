package com.codebrewers.mainbackend.Class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Data
public class PayloadPurchaseClass {
    @Id
    private String long_name;
    private String id;
    private Integer tag;
    private String barcode;
    private Integer quantity;

    public String getIngredientBarcode() {
        return barcode;
    }

}
