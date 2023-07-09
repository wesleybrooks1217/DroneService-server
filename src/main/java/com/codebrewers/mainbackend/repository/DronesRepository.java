package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.Class.DronesClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DronesRepository extends JpaRepository<DronesClass, String> {

    @Query(value = "SELECT * FROM drones", nativeQuery = true)
    List<DronesClass> getAllDrones();

    @Query(value = "SELECT count(*) FROM drones WHERE id = ?1", nativeQuery = true)
    int countDronesById (String id);
}
