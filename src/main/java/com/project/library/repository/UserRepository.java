package com.project.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.library.domain.User;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);

    List<User> findAll();

    User findById(long id);

    User findUserByUsername(String username);

    User findUserByEmail(String email);

    @Transactional
    void deleteById(long id);

    void deleteAll();
    // Optional<User> getUserById(int id);

    // Optional<User> getUserByUsername(String username);

    // User activateUser(User user)

    // User updateUser(int id, User user);

    // void deleteUser(int id);
}
