package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.ServiceCategory;
import com.project.onligneappointment.service.interfaces.IServiceCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCategoryRepository extends JpaRepository<ServiceCategory, Long> {
}
