package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.Restaurant_ownersClass;
import com.codebrewers.mainbackend.Class.UsersClass;
import com.codebrewers.mainbackend.repository.Restaurant_ownersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class Restaurant_ownersService {

    @Autowired
    private Restaurant_ownersRepository restaurant_ownersRepository;

    /**
     * Service to find all restaurant_owners in the DB.
     * @return All restaurant_owners in the DB.
     */
    public List<Restaurant_ownersClass> findAllRestaurant_owners() {
       return restaurant_ownersRepository.getAllRestaurant_owners();
    }

    public void saveRestaurant_owner(UsersClass newUser) {
        System.out.println("service 1" + newUser.getUsername() + newUser.getFirst_name());
        if (restaurant_ownersRepository.countRestaurant_ownersByName(newUser.getUsername()) == 0) {
            addRestaurantOwnersClass(newUser);
        }
    }
    @PersistenceContext
    private EntityManager entityManager;
    public void addRestaurantOwnersClass(UsersClass newUser) {
        System.out.println("Servoce 2" + newUser.getUsername() + newUser.getFirst_name()
                + newUser.getLast_name() + newUser.getAddress() + newUser.getBirthdate());
        entityManager.createNativeQuery("call add_owner (?,?,?,?,?);")
                .setParameter(1, newUser.getUsername())
                .setParameter(2, newUser.getFirst_name())
                .setParameter(3, newUser.getLast_name())
                .setParameter(4, newUser.getAddress())
                .setParameter(5, newUser.getBirthdate())
                .executeUpdate();
    }
}
