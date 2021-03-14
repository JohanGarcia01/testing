package com.endava.backendFrontchallenge.service;

import com.endava.backendFrontchallenge.model.User;
import com.endava.backendFrontchallenge.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> findById(String id){
        return userRepository.findById(id);
    }

    public User saveUser(User user){
        user.set_id(String.valueOf(Math.random()));
        return userRepository.save(user);
    }

}
