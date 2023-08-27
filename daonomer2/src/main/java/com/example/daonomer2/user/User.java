package com.example.daonomer2.user;

import com.example.daonomer2.Id.UserId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "persons")
@NamedNativeQuery(
        name = "User.findAll",
        query = "select * from persons p where p.city_of_living = :city"
)

public class User {
    @EmbeddedId
    private UserId userid;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column( name = "city_of_living", nullable = false)
    private String cityOfLiving;

}
