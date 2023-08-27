package com.example.daonomer2.repository;

import com.example.daonomer2.user.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class UserRepository {
    @PersistenceContext
    private EntityManager entityManager;


    public List<User> getPersonsByCity(String city) {


        var query = entityManager.createNamedQuery("User.findAll");
        query.setParameter("city", city).getResultList();

        List<User> personList1 = query.getResultList();

        return personList1;
    }
}
