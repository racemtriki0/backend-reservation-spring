package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.Role;
import com.project.onligneappointment.service.interfaces.IRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role saveRole(Role role);
    Role updateRole(Role role);
    boolean deleteRole(Long id);
}
