package com.project.onligneappointment.service.interfaces;

import com.project.onligneappointment.persistance.entities.User;

import java.util.List;

public interface IUser {
    User saveUser(User user);
    User updateUser(User user);
    User getUserById(Long id);

    List<User> getListUser();
    boolean deleteUser(Long id);
    User validateUser(String email, String password);
}
