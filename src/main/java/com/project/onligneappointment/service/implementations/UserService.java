package com.project.onligneappointment.service.implementations;

import com.project.onligneappointment.persistance.dao.UserRepository;
import com.project.onligneappointment.persistance.entities.User;
import com.project.onligneappointment.service.interfaces.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUser {
    @Autowired
    UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getListUser() {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteUser(Long id) {
        userRepository.deleteById(id);
        return true;
    }

    @Override
    public User validateUser(String email, String password) {
        return userRepository.findByEmailAndPassword(email,password);
    }
}
