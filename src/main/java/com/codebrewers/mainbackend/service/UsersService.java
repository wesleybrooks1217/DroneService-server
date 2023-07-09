package com.codebrewers.mainbackend.service;
import com.codebrewers.mainbackend.Class.UsersClass;
import com.codebrewers.mainbackend.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    /**
     * Service to find all users in the DB.
     * @return All users in the DB.
     */
    public List<UsersClass> findAllUsers() {
       return usersRepository.getAllUsers();
    }

    public void saveUser(UsersClass newUser) {
        if (usersRepository.countUsersByName(newUser.getUsername()) == 0) {
            System.out.println(newUser.getUsername() + newUser.getFirst_name() + newUser.getLast_name() + newUser.getAddress() + newUser.getBirthdate());
            //usersRepository.insertUser(newUser.getUsername(), newUser.getFirst_name(), newUser.getLast_name(), newUser.getAddress(), newUser.getBirthdate());
            addUser(newUser);
        }
    }

    @PersistenceContext
    private EntityManager entityManager;

    public void addUser(UsersClass newUser) {
        entityManager.createNativeQuery("insert into users values (?,?,?,?,?)")
                .setParameter(1, newUser.getUsername())
                .setParameter(2, newUser.getFirst_name())
                .setParameter(3, newUser.getLast_name())
                .setParameter(4, newUser.getAddress())
                .setParameter(5, newUser.getBirthdate())
                .executeUpdate();
    }
}
