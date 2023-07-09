package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.Class.RestaurantsClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantsRepository extends JpaRepository<RestaurantsClass, String> {

    @Query(value = "SELECT * FROM restaurants", nativeQuery = true)
    List<RestaurantsClass> getAllRestaurants();

    @Query(value = "SELECT count(*) FROM restaurants WHERE long_name = ?1", nativeQuery = true)
    int countRestaurantsByName(String name);
}
