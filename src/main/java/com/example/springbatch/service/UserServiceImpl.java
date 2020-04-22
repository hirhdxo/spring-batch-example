package com.example.springbatch.service;

import com.example.springbatch.entity.User;
import com.example.springbatch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public void searchLessTenAgeAndChangeStatus() {
        List<User> users = userRepository.findByAgeLessThanEqual(10);

        users.forEach(user -> user.changeActiveStatus(false));
    }
}
