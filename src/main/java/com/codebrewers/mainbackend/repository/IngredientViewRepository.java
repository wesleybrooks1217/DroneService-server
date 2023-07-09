package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.views.IngredientView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface IngredientViewRepository extends JpaRepository<IngredientView, String> {

    @Query(value = "SELECT * FROM display_ingredient_view", nativeQuery = true)
    List<IngredientView> getAllIngredient();

}
