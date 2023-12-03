package com.project.onligneappointment.service.interfaces;

import com.project.onligneappointment.persistance.entities.User;

public interface IUser {
    User saveUser(User user);
    User updateUser(User user);
    boolean deleteUser(Long id);
    User validateUser(String email, String password);
}
