package com.project.onligneappointment.service.interfaces;


import com.project.onligneappointment.persistance.entities.Role;

import java.util.List;

public interface IRole {
    Role saveRole(Role role);
    Role updateRole(Role role);
    boolean deleteRole(Long id);
    List<Role> getListRole();
}
