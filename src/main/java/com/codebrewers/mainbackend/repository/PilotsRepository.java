package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.Class.PilotsClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PilotsRepository extends JpaRepository<PilotsClass, String> {

    @Query(value = "SELECT * FROM pilots", nativeQuery = true)
    List<PilotsClass> getAllPilots();

    @Query(value = "SELECT count(*) FROM pilots WHERE username = ?1", nativeQuery = true)
    int countPilotsByName(String name);
}
