package com.example.daonomer2.controller;

import com.example.daonomer2.repository.UserRepository;
import com.example.daonomer2.user.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class UserController {
    private final UserRepository userRepository;
    @GetMapping("/persons/by-city")
    protected List<User> getPersonsByCity(@RequestParam(value = "city", required = false) String city) {
        return userRepository.getPersonsByCity(city);
    }
}
