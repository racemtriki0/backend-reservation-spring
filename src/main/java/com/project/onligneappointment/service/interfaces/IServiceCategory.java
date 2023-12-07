package com.project.onligneappointment.service.interfaces;

import com.project.onligneappointment.persistance.entities.ServiceCategory;

import java.util.List;

public interface IServiceCategory {
    ServiceCategory saveServiceCategory(ServiceCategory serviceCategory);
    ServiceCategory updateServiceCategory(ServiceCategory serviceCategory);
    boolean deleteServiceCategory(Long id);
    List<ServiceCategory> getListCategory();
}
