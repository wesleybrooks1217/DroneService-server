package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.LocationsClass;
import com.codebrewers.mainbackend.repository.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class LocationsService {

    @Autowired
    private LocationsRepository locationsRepository;

    /**
     * Service to find all locations in the DB.
     * @return All locations in the DB.
     */
    public List<LocationsClass> findAllLocations() {
       return locationsRepository.getAllLocations();
    }
    @PersistenceContext
    private EntityManager entityManager;
    public void addLocation(LocationsClass newLocation) {
        entityManager.createNativeQuery("call add_location(?,?,?, ?)")
                .setParameter(1, newLocation.getLabel())
                .setParameter(2, newLocation.getX_coord())
                .setParameter(3, newLocation.getY_coord())
                .setParameter(4, newLocation.getSpace())
                .executeUpdate();
    }
}
