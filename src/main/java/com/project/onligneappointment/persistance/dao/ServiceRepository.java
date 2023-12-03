package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.Service;
import com.project.onligneappointment.service.interfaces.IService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
