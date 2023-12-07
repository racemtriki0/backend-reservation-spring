package com.project.onligneappointment.service.interfaces;

import com.project.onligneappointment.persistance.entities.ProviderAvailability;
import com.project.onligneappointment.persistance.entities.User;

import java.util.List;

public interface IProviderAvailability {
    ProviderAvailability saveProviderAvailability(ProviderAvailability availability);
    ProviderAvailability updateProviderAvailability(ProviderAvailability availability);
    boolean deleteProviderAvailability(Long id);
    List<ProviderAvailability> getList();

}
