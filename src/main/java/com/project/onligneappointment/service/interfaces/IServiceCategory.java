package com.project.onligneappointment.service.interfaces;

import com.project.onligneappointment.persistance.entities.ServiceCategory;

public interface IServiceCategory {
    ServiceCategory saveServiceCategory(ServiceCategory serviceCategory);
    ServiceCategory updateServiceCategory(ServiceCategory serviceCategory);
    boolean deleteServiceCategory(Long id);
}
