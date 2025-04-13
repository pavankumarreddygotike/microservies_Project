package com.user_service.User_Service.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.user_service.User_Service.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

