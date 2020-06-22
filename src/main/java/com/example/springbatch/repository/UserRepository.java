package com.example.springbatch.repository;

import com.example.springbatch.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByAgeLessThanEqual(int age);
}
