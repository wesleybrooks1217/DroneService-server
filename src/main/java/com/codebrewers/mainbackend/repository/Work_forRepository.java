package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.Class.Work_forClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Work_forRepository extends JpaRepository<Work_forClass, String> {

    @Query(value = "SELECT * FROM work_for", nativeQuery = true)
    List<Work_forClass> getAllWork_for();

    @Query(value = "SELECT count(*) FROM work_for WHERE username = ?1", nativeQuery = true)
    int countWork_forByName(String name);
}
