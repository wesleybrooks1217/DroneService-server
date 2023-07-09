package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.WorkersClass;
import com.codebrewers.mainbackend.repository.WorkersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class WorkersService {

    @Autowired
    private WorkersRepository workersRepository;

    /**
     * Service to find all workers in the DB.
     * @return All workers in the DB.
     */
    public List<WorkersClass> findAllWorkers() {
       return workersRepository.getAllWorkers();
    }
    @PersistenceContext
    private EntityManager entityManager;
    public void addWorker(WorkersClass newWorker) {
        entityManager.createNativeQuery("call add_worker_role(?)")
                .setParameter(1, newWorker.getUsername())
                .executeUpdate();
    }
}
