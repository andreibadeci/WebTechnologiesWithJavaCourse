package com.fmi.fmimdb.repository;

import com.fmi.fmimdb.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
        System.out.println("Added user " + user.toString());
    }

    public void removeUser(User user) {
        userList.remove(user);
        System.out.println("Removed user " + user.toString());
    }

    public void updateUser(User originalUser, User updatedUser) {
        userList.set(userList.indexOf(originalUser), updatedUser);
        System.out.println("Updated user " + originalUser.toString() + " to " + updatedUser.toString());
    }

    public List<User> getAllUsers() {
        return userList;
    }
}
