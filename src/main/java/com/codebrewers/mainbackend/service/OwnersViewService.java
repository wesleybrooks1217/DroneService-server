package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.views.OwnersView;
import com.codebrewers.mainbackend.Class.UsersClass;
import com.codebrewers.mainbackend.repository.OwnersViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class OwnersViewService {

    @Autowired
    private OwnersViewRepository ownersViewRepository;

    /**
     * Service to find all restaurant_owners in the DB.
     * @return All restaurant_owners in the DB.
     */
    public List<OwnersView> displayAllOwner() {
        return ownersViewRepository.getAllOwners();
    }
}
