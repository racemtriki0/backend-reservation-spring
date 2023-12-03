package com.project.onligneappointment.service.interfaces;

import com.project.onligneappointment.persistance.entities.Provider;
import com.project.onligneappointment.persistance.entities.Service;
import com.project.onligneappointment.persistance.entities.User;

import java.util.List;

public interface IService {
    Service saveService(Service service);
    Service updateService(Service service);
    boolean deleteService(Long id);
    List<Service> getListService(Provider provider);
    Service findById(Long id);

    int getQuantityOfService();
}
