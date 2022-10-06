package com.example.sProject.repository;

import com.example.sProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface UserDao extends JpaRepository<User,Integer> {


   Optional<List<User>> findByFirstname(String name);
}
