package com.project.onligneappointment.service.controller;

import com.project.onligneappointment.persistance.entities.Role;
import com.project.onligneappointment.service.interfaces.IRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/role")
public class RoleController {
    @Autowired
    IRole roleservice;
    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    Role save(@RequestBody Role role){
        Role r= roleservice.saveRole(role);
        System.out.println("*******"+r.getLibelle());
        return r;
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    Role update(@RequestBody Role role){
        Role r= roleservice.updateRole(role);
        System.out.println("*******"+r.getLibelle());
        return r;
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id){
        roleservice.deleteRole(id);
        return true;
    }

    @GetMapping("/list")
    List<Role> getListRole(){
        return roleservice.getListRole();
    }


}
