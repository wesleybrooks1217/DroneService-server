package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.views.ServicesView;
import com.codebrewers.mainbackend.repository.ServicesViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class ServicesViewService {

    @Autowired
    private ServicesViewRepository servicesViewRepository;

    /**
     * Service to find all services in the DB.
     * @return All services in the DB.
     */
    public List<ServicesView> displayAllServices() {
        return servicesViewRepository.getAllServices();
    }
}
