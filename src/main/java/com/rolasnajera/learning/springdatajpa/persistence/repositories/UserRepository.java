package com.rolasnajera.learning.springdatajpa.persistence.repositories;

import com.rolasnajera.learning.springdatajpa.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
