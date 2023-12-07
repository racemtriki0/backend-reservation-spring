package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.Role;
import com.project.onligneappointment.service.interfaces.IRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query(value = "select count(*) from role",nativeQuery = true)
    int getQuantityOfRole();
}
