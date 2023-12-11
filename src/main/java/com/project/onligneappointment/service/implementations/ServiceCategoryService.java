package com.project.onligneappointment.service.implementations;

import com.project.onligneappointment.persistance.dao.ServiceCategoryRepository;
import com.project.onligneappointment.persistance.entities.ServiceCategory;
import com.project.onligneappointment.service.interfaces.IServiceCategory;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ServiceCategoryService implements IServiceCategory {
    @Autowired
    ServiceCategoryRepository serviceCategoryRepository;
    @Override
    public ServiceCategory saveServiceCategory(ServiceCategory serviceCategory) {
        return serviceCategoryRepository.save(serviceCategory);
    }

    @Override
    public ServiceCategory updateServiceCategory(ServiceCategory serviceCategory) {
        return serviceCategoryRepository.saveAndFlush(serviceCategory);
    }

    @Override
    public boolean deleteServiceCategory(Long id) {
        serviceCategoryRepository.deleteById(id);
        return true;
    }

    @Override
    public List<ServiceCategory> getListCategory() {
        return serviceCategoryRepository.findAll();
    }
}
