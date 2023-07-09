package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.views.PilotsView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface PilotsViewRepository extends JpaRepository<PilotsView, String> {

    @Query(value = "SELECT * FROM display_pilot_view", nativeQuery = true)
    List<PilotsView> getAllPilots();

}
