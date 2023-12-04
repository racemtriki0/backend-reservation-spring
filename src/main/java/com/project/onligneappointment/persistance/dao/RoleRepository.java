package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.Role;
import com.project.onligneappointment.service.interfaces.IRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role save(Role role);
    Role update(Role role);
    boolean delete(Long id);
}
