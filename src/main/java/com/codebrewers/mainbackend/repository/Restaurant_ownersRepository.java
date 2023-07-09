package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.Class.Restaurant_ownersClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Restaurant_ownersRepository extends JpaRepository<Restaurant_ownersClass, String> {

    @Query(value = "SELECT * FROM restaurant_owners", nativeQuery = true)
    List<Restaurant_ownersClass> getAllRestaurant_owners();

    @Query(value = "SELECT count(*) FROM restaurant_owners WHERE username = ?1", nativeQuery = true)
    int countRestaurant_ownersByName(String name);
}
