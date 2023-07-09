package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.Class.LocationsClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationsRepository extends JpaRepository<LocationsClass, String> {

    @Query(value = "SELECT * FROM locations", nativeQuery = true)
    List<LocationsClass> getAllLocations();

    @Query(value = "SELECT count(*) FROM locations WHERE label = ?1", nativeQuery = true)
    int countLocationsByLabel(String label);
}
