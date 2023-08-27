package com.example.daonomer2.addData;

import com.example.daonomer2.Id.UserId;
import com.example.daonomer2.user.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataAdd implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public void run(String... args) throws Exception {

        User ivan = User.builder().userid(UserId.builder()
                        .name("Vova")
                        .surname("VOvanich")
                        .age(26)
                        .build())
                .phoneNumber("8(777)-777-77-77")
                .cityOfLiving("SPB")
                .build();

        User mama = User.builder().userid(UserId.builder()
                        .name("Mama")
                        .surname("Papa")
                        .age(19)
                        .build())
                .phoneNumber("8(778)-666-66-66")
                .cityOfLiving("Moscow")
                .build();


//entityManager.persist(ivan);

//entityManager.persist(mama);




    }
}

