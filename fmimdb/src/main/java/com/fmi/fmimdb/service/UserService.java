package com.fmi.fmimdb.service;

import com.fmi.fmimdb.model.User;
import com.fmi.fmimdb.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public void removeUser(User user) {
        userRepository.removeUser(user);
    }

    public void updateMovie(User originalUser, User updatedUser) {
        userRepository.updateUser(originalUser, updatedUser);
    }

    public List<User> getAllMovies() {
        return userRepository.getAllUsers();
    }

}
