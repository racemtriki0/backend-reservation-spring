package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.ServiceCategory;
import com.project.onligneappointment.service.interfaces.IServiceCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ServiceCategoryRepository extends JpaRepository<ServiceCategory, Long> {
    @Query(value = "select count(*) from serviceCategory",nativeQuery = true)
    int getQuantityOfServiceCategory();
}
