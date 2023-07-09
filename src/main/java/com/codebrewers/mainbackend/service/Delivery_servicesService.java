package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.Delivery_servicesClass;
import com.codebrewers.mainbackend.Class.RestaurantsClass;
import com.codebrewers.mainbackend.repository.Delivery_servicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class Delivery_servicesService {

    @Autowired
    private Delivery_servicesRepository delivery_servicesRepository;

    /**
     * Service to find all delivery_services in the DB.
     * @return All delivery_services in the DB.
     */
    public List<Delivery_servicesClass> findAllDelivery_services() {
       return delivery_servicesRepository.getAllDelivery_services();
    }
    @PersistenceContext
    private EntityManager entityManager;
    public void addService(Delivery_servicesClass newService) {
        entityManager.createNativeQuery("call add_service (?,?,?,?);")
                .setParameter(1, newService.getId())
                .setParameter(2, newService.getLong_name())
                .setParameter(3, newService.getHome_base())
                .setParameter(4, newService.getManager())
                .executeUpdate();
    }

    public void manageService(Delivery_servicesClass newService) {
        entityManager.createNativeQuery("call manage_service (?,?);")
                .setParameter(1, newService.getManager())
                .setParameter(2, newService.getId())
                .executeUpdate();
    }
}
