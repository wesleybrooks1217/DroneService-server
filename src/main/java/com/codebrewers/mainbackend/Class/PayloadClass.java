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
@Table(name = "payload")
public class PayloadClass {
    @Id
    private String id;
    private Integer tag;
    private String barcode;
    private Integer quantity;
    private Integer price;

    public String getPayloadId() {
        return id;
    }

}
