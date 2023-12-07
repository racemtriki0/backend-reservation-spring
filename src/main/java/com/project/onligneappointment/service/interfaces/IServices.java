package com.project.onligneappointment.service.interfaces;

import com.project.onligneappointment.persistance.entities.Services;

import java.util.List;

public interface IServices {
    Services saveServicePro(Services service);
    Services updateServicePro(Services service);
    boolean deleteServicePro(Long id);
    List<Services> getListServicePro();
    Services findServiceProById(Long id);

    int getQuantityOfService();
}
