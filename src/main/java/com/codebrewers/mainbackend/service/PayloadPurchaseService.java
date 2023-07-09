package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.PayloadClass;
import com.codebrewers.mainbackend.Class.PayloadPurchaseClass;
import com.codebrewers.mainbackend.repository.PayloadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class PayloadPurchaseService {

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
    public void purchase_ingredient(PayloadPurchaseClass newPayload) {
        entityManager.createNativeQuery("call purchase_ingredient (?,?,?,?,?);")
                .setParameter(1, newPayload.getLong_name())
                .setParameter(2, newPayload.getId())
                .setParameter(3, newPayload.getTag())
                .setParameter(4, newPayload.getBarcode())
                .setParameter(5, newPayload.getQuantity())
                .executeUpdate();
    }
}
