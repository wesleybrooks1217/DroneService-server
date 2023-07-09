package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.EmployeesClass;
import com.codebrewers.mainbackend.Class.Work_forClass;
import com.codebrewers.mainbackend.repository.Work_forRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class Work_forService {

    @Autowired
    private Work_forRepository work_forRepository;

    /**
     * Service to find all work_for in the DB.
     * @return All work_for in the DB.
     */
    public List<Work_forClass> findAllWork_for() {
       return work_forRepository.getAllWork_for();
    }
    @PersistenceContext
    private EntityManager entityManager;
    public void hireNewEmployee(Work_forClass newWork_for) {
        entityManager.createNativeQuery("call hire_employee (?,?);")
                .setParameter(1, newWork_for.getUsername())
                .setParameter(2, newWork_for.getId())
                .executeUpdate();
    }
    public void fireNewEmployee(Work_forClass newWork_for) {
        entityManager.createNativeQuery("call fire_employee (?,?);")
                .setParameter(1, newWork_for.getUsername())
                .setParameter(2, newWork_for.getId())
                .executeUpdate();
    }
}
