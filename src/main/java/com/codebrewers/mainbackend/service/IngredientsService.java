package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.IngredientsClass;
import com.codebrewers.mainbackend.Class.UsersClass;
import com.codebrewers.mainbackend.repository.IngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class IngredientsService {

    @Autowired
    private IngredientsRepository ingredientsRepository;

    /**
     * Service to find all ingredients in the DB.
     * @return All ingredients in the DB.
     */
    public List<IngredientsClass> findAllIngredients() {
       return ingredientsRepository.getAllIngredients();
    }
    @PersistenceContext
    private EntityManager entityManager;
    public void addIngredient(IngredientsClass newIngredient) {
        entityManager.createNativeQuery("call add_ingredient (?,?,?);")
                .setParameter(1, newIngredient.getBarcode())
                .setParameter(2, newIngredient.getIname())
                .setParameter(3, newIngredient.getWeight())
                .executeUpdate();
    }
    public void removeIngredient(IngredientsClass newIngredient) {
        entityManager.createNativeQuery("call remove_ingredient (?);")
                .setParameter(1, newIngredient.getBarcode())
                .executeUpdate();
    }
}
