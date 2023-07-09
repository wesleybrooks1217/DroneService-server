package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.DronesClass;
import com.codebrewers.mainbackend.repository.DronesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class DronesService {

    @Autowired
    private DronesRepository dronesRepository;

    /**
     * Service to find all drones in the DB.
     * @return All drones in the DB.
     */
    public List<DronesClass> findAllDrones() {
       return dronesRepository.getAllDrones();
    }


    /*public void saveRestaurant_owner(DronesClass newDrone) {
        if (newDrone.countDro(newUser.getUsername()) == 0) {
            addRestaurantOwnersClass(newDrone);
        }
    }*/
    @PersistenceContext
    private EntityManager entityManager;
    public void droneTakeover(DronesClass newDrone) {
        entityManager.createNativeQuery("call takeover_drone (?,?,?);")
                .setParameter(1, newDrone.getFlown_by())
                .setParameter(2, newDrone.getId())
                .setParameter(3, newDrone.getTag())
                .executeUpdate();
        }
    public void joinSwarm(DronesClass newDrone) {
        entityManager.createNativeQuery("call join_swarm (?,?,?);")
                .setParameter(1, newDrone.getId())
                .setParameter(2, newDrone.getTag())
                .setParameter(3, newDrone.getSwarm_tag())
                .executeUpdate();
    }
    public void leaveSwarm(DronesClass newDrone) {
        entityManager.createNativeQuery("call leave_swarm (?,?);")
                .setParameter(1, newDrone.getId())
                .setParameter(2, newDrone.getTag())
                .executeUpdate();
    }

    public void refuelDrone(DronesClass newDrone) {
        entityManager.createNativeQuery("call refuel_drone (?,?,?);")
                .setParameter(1, newDrone.getId())
                .setParameter(2, newDrone.getTag())
                .setParameter(3, newDrone.getFuel())
                .executeUpdate();
    }

    public void flyDrone(DronesClass newDrone) {
        entityManager.createNativeQuery("call fly_drone (?,?,?);")
                .setParameter(1, newDrone.getId())
                .setParameter(2, newDrone.getTag())
                .setParameter(3, newDrone.getHover())
                .executeUpdate();
    }
    public void addDronesClass(DronesClass newDrone) {
        entityManager.createNativeQuery("call add_drone (?,?,?,?,?,?);")
                .setParameter(1, newDrone.getId())
                .setParameter(2, newDrone.getTag())
                .setParameter(3, newDrone.getFuel())
                .setParameter(4, newDrone.getCapacity())
                .setParameter(5, newDrone.getSales())
                .setParameter(6, newDrone.getFlown_by())
                .executeUpdate();
    }

    public void removeDrone(DronesClass newDrone) {
        entityManager.createNativeQuery("call remove_drone (?,?);")
                .setParameter(1, newDrone.getId())
                .setParameter(2, newDrone.getTag())
                .executeUpdate();
    }
}
