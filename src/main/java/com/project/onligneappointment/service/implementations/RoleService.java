package com.project.onligneappointment.service.implementations;

import com.project.onligneappointment.persistance.dao.RoleRepository;
import com.project.onligneappointment.persistance.entities.Role;
import com.project.onligneappointment.service.interfaces.IRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRole {
    @Autowired
    RoleRepository roleRepository;
    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role updateRole(Role role) {
        return roleRepository.saveAndFlush(role);
    }

    @Override
    public boolean deleteRole(Long id) {
        roleRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Role> getListRole() {
        return roleRepository.findAll();
    }
}
