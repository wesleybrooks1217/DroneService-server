package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.Class.PayloadClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayloadRepository extends JpaRepository<PayloadClass, String> {

    @Query(value = "SELECT * FROM payload", nativeQuery = true)
    List<PayloadClass> getAllPayload();

    @Query(value = "SELECT count(*) FROM payload WHERE id = ?1", nativeQuery = true)
    int countPayloadById (String id);
}
