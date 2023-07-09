package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.Class.IngredientsClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientsRepository extends JpaRepository<IngredientsClass, String> {

    @Query(value = "SELECT * FROM ingredients", nativeQuery = true)
    List<IngredientsClass> getAllIngredients();

    @Query(value = "SELECT count(*) FROM ingredients WHERE barcode = ?1", nativeQuery = true)
    int countIngredientsByBarcode (String barcode);
}
