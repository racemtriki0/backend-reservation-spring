package com.project.onligneappointment.service.interfaces;


import com.project.onligneappointment.persistance.entities.Role;

public interface IRole {
    Role saveRole(Role role);
    Role updateRole(Role role);
    boolean deleteRole(Long id);
}
