package com.project.onligneappointment.service.implementations;

import com.project.onligneappointment.persistance.dao.ServicesRepository;
import com.project.onligneappointment.service.interfaces.IServices;
import com.project.onligneappointment.persistance.entities.Services;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ServicesService implements IServices {
    @Autowired
    ServicesRepository servicesRepository;
    @Override
    public Services saveServicePro(Services service) {
        return servicesRepository.save(service);
    }

    @Override
    public Services updateServicePro(Services service) {
        return servicesRepository.saveAndFlush(service);
    }

    @Override
    public boolean deleteServicePro(Long id) {
        servicesRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Services> getListServicePro() {
        return servicesRepository.findAll();
    }

    @Override
    public Services findServiceProById(Long id) {
        return servicesRepository.findById(id).get();
    }

    @Override
    public int getQuantityOfService() {
        return servicesRepository.getQuantityOfService();
    }
}
