package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.PayloadClass;
import com.codebrewers.mainbackend.repository.PayloadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class PayloadService {

    @Autowired
    private PayloadRepository payloadRepository;

    /**
     * Service to find all payload in the DB.
     * @return All payload in the DB.
     */
    public List<PayloadClass> findAllPayload() {
       return payloadRepository.getAllPayload();
    }
    @PersistenceContext
    private EntityManager entityManager;
    public void loadDrone(PayloadClass newPayload) {
        entityManager.createNativeQuery("call load_drone (?,?,?,?,?);")
                .setParameter(1, newPayload.getId())
                .setParameter(2, newPayload.getTag())
                .setParameter(3, newPayload.getBarcode())
                .setParameter(4, newPayload.getQuantity())
                .setParameter(5, newPayload.getPrice())
                .executeUpdate();
    }
    public void purchase_ingredient(PayloadClass newPayload) {
        entityManager.createNativeQuery("call purchase_ingredient (?,?,?,?,?);")
                .setParameter(1, newPayload.getId())
                .setParameter(2, newPayload.getTag())
                .setParameter(3, newPayload.getBarcode())
                .setParameter(4, newPayload.getQuantity())
                .setParameter(5, newPayload.getPrice())
                .executeUpdate();
    }
}
