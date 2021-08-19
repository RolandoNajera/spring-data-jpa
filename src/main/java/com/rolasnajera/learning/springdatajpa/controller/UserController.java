package com.rolasnajera.learning.springdatajpa.controller;

import com.rolasnajera.learning.springdatajpa.persistence.entities.User;
import com.rolasnajera.learning.springdatajpa.persistence.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }

    @GetMapping("/users")
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable String userId) {
        return userRepository.getById(UUID.fromString(userId));
    }

    @PutMapping("/users/{userId}")
    public User putUser(@PathVariable String userId, @RequestBody User user) {
        user.setUserId(UUID.fromString(userId));
        return userRepository.save(user);
    }

}
