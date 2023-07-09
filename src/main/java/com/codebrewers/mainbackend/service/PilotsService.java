package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.IngredientsClass;
import com.codebrewers.mainbackend.Class.PilotsClass;
import com.codebrewers.mainbackend.repository.PilotsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class PilotsService {

    @Autowired
    private PilotsRepository pilotsRepository;

    /**
     * Service to find all pilots in the DB.
     * @return All pilots in the DB.
     */
    public List<PilotsClass> findAllPilots() {
       return pilotsRepository.getAllPilots();
    }
    @PersistenceContext
    private EntityManager entityManager;
    public void addPilotRole(PilotsClass newPilot) {
        entityManager.createNativeQuery("call add_pilot_role(?,?,?)")
                .setParameter(1, newPilot.getPilotname())
                .setParameter(2, newPilot.getLicenseID())
                .setParameter(3, newPilot.getExperience())
                .executeUpdate();
    }
    public void removePilotRole(PilotsClass newPilot) {
        entityManager.createNativeQuery("call remove_pilot_role(?)")
                .setParameter(1, newPilot.getPilotname())
                .executeUpdate();
    }
}
