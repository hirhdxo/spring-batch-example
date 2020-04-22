package com.example.springbatch.repository;

import com.example.springbatch.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByAgeLessThanEqual(int age);
}
