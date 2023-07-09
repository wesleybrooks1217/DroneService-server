package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.views.LocationsView;
import com.codebrewers.mainbackend.repository.LocationsViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class LocationsViewService {

    @Autowired
    private LocationsViewRepository locationsViewRepository;

    /**
     * Service to find all locations in the DB.
     * @return All locations in the DB.
     */
    public List<LocationsView> displayAllLocations() {
        return locationsViewRepository.getAllLocations();
    }
}
