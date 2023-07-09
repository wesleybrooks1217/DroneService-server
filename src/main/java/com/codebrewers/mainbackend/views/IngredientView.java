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
@Table(name = "display_ingredient_view")
public class IngredientView {
    @Id
    private String iname;
    private String location;
    private Integer amount_available;
    private Integer minp;
    private Integer maxp;
}
