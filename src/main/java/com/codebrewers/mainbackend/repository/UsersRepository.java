package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.Class.UsersClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<UsersClass, String> {

    @Query(value = "SELECT * FROM users", nativeQuery = true)
    List<UsersClass> getAllUsers();

    @Query(value = "SELECT count(*) FROM users WHERE username = ?1", nativeQuery = true)
    int countUsersByName(String name);

    @Modifying
    @Query(value = "insert into users (username, first_name, last_name, address, birthdate) values (:username, :first_name, :last_name, :address, :birthdate)", nativeQuery = true)
    void insertUser(@Param("username") String username, @Param("first_name") String first_name, @Param("last_name") String last_name,
                    @Param("address") String address, @Param("birthdate") Date birthdate);
}
