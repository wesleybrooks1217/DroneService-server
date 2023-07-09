package com.codebrewers.mainbackend.repository;


import com.codebrewers.mainbackend.Class.Delivery_servicesClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Delivery_servicesRepository extends JpaRepository<Delivery_servicesClass, String> {

    @Query(value = "SELECT * FROM delivery_services", nativeQuery = true)
    List<Delivery_servicesClass> getAllDelivery_services();

    @Query(value = "SELECT count(*) FROM delivery_services WHERE id = ?1", nativeQuery = true)
    int countDelivery_servicesById(String id);
}
