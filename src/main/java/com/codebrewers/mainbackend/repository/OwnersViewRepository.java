package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.views.OwnersView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface OwnersViewRepository extends JpaRepository<OwnersView, String> {

    @Query(value = "SELECT * FROM display_owner_view", nativeQuery = true)
    List<OwnersView> getAllOwners();

    @Query(value = "SELECT count(*) FROM users WHERE username = ?1", nativeQuery = true)
    int countUsersByName(String name);

}
