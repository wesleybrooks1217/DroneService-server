package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.views.PilotsView;
import com.codebrewers.mainbackend.repository.PilotsViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class PilotsViewService {

    @Autowired
    private PilotsViewRepository pilotViewRepository;

    /**
     * Service to find all pilot in the DB.
     * @return All pilot in the DB.
     */
    public List<PilotsView> displayAllPilots() {
        return pilotViewRepository.getAllPilots();
    }
}
