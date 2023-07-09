package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.Class.WorkersClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkersRepository extends JpaRepository<WorkersClass, String> {

    @Query(value = "SELECT * FROM workers", nativeQuery = true)
    List<WorkersClass> getAllWorkers();

    @Query(value = "SELECT count(*) FROM workers WHERE username = ?1", nativeQuery = true)
    int countWorkersByName(String name);
}
