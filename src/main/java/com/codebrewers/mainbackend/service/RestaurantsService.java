package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.DronesClass;
import com.codebrewers.mainbackend.Class.RestaurantsClass;
import com.codebrewers.mainbackend.repository.RestaurantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class RestaurantsService {

    @Autowired
    private RestaurantsRepository restaurantsRepository;

    /**
     * Service to find all restaurants in the DB.
     * @return All restaurants in the DB.
     */
    public List<RestaurantsClass> findAllRestaurants() {
       return restaurantsRepository.getAllRestaurants();
    }
    @PersistenceContext
    private EntityManager entityManager;
    public void addRestaurant(RestaurantsClass newRestaurant) {
        entityManager.createNativeQuery("call add_restaurant (?,?,?,?);")
                .setParameter(1, newRestaurant.getLong_name())
                .setParameter(2, newRestaurant.getRating())
                .setParameter(3, newRestaurant.getSpent())
                .setParameter(4, newRestaurant.getLocation())
                .executeUpdate();
    }
    public void addFunding(RestaurantsClass newRestaurant) {
        entityManager.createNativeQuery("call start_funding (?,?);")
                .setParameter(1, newRestaurant.getFunded_by())
                .setParameter(2, newRestaurant.getLong_name())
                .executeUpdate();
    }
}
