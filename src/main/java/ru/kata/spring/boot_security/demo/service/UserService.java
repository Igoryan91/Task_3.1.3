package ru.kata.spring.boot_security.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void saveUser(User user);

    User getUser(String username);

    List<User> getAllUsers();

    void updateUser(int id, User updatedUser);

    void removeUser(int id);
}
