package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
