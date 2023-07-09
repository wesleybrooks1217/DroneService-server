package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.Delivery_servicesClass;
import com.codebrewers.mainbackend.Class.ServiceManageClass;
import com.codebrewers.mainbackend.repository.Delivery_servicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class manageServiceService {

    @Autowired

    /**
     * Service to find all delivery_services in the DB.
     * @return All delivery_services in the DB.
     */
    @PersistenceContext
    private EntityManager entityManager;
    public void manageService(ServiceManageClass newService) {
        System.out.println("Hello");
        entityManager.createNativeQuery("call manage_service (?,?);")
                .setParameter(1, newService.getUsername())
                .setParameter(2, newService.getId())
                .executeUpdate();
    }
}
