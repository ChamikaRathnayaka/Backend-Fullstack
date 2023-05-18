package com.example.springboot.Backend.repository;

import com.example.springboot.Backend.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
