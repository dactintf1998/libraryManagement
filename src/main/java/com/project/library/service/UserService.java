package com.project.library.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.project.library.domain.User;
import com.project.library.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        List<User> users = this.userRepository.findAll();
        return users;
    }

    public User getUserById(long id) {
        return this.userRepository.findById(id);
    }

    public User getUserByUsername(String username) {
        return this.userRepository.findUserByUsername(username);
    }

    public User getUserByEmail(String email) {
        return this.userRepository.findUserByEmail(email);
    }

    public void addUser(User user) {
        this.userRepository.save(user);
    }

    public void updateUser(User user, User newUser) {
        user.setEmail(newUser.getEmail());
        user.setPassword(newUser.getPassword());
        this.userRepository.save(user);
    }

    public void deleteUser(long id) {
        this.userRepository.deleteById(id);
    }
}
