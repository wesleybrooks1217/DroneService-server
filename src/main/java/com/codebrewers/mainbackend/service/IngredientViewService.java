package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.views.IngredientView;
import com.codebrewers.mainbackend.repository.IngredientViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class IngredientViewService {

    @Autowired
    private IngredientViewRepository ingredientViewRepository;

    /**
     * Service to find all restaurant_ingredient in the DB.
     * @return All restaurant_ingredient in the DB.
     */
    public List<IngredientView> displayAllIngredient() {
        return ingredientViewRepository.getAllIngredient();
    }
}
