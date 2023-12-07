package com.project.onligneappointment.service.controller;

import com.project.onligneappointment.persistance.entities.User;
import com.project.onligneappointment.service.interfaces.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    IUser userservice;
    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    User save(@RequestBody User user) {
        User u=userservice.saveUser(user);
        System.out.println("*******"+u.getEmail());
        return u ;
    }

    @RequestMapping(method = RequestMethod.PUT, consumes="application/json", produces = "application/json")
    User update(@RequestBody User user) {
        User u=userservice.updateUser(user);
        System.out.println("*******"+u.getEmail());
        return u ;
    }


    @GetMapping("get/{id}")
    User getUserById(@PathVariable Long id) {
        return userservice.getUserById(id);
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
        userservice.deleteUser(id);
        return true;
    }
    @GetMapping("/list")
    List<User> getAllPatient() {
        return userservice.getListUser();
    }
}
