package com.project.onligneappointment.service.implementations;

import com.project.onligneappointment.persistance.dao.ProviderAvailabilityRepository;
import com.project.onligneappointment.persistance.entities.ProviderAvailability;
import com.project.onligneappointment.service.interfaces.IProviderAvailability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderAvailabilityService implements IProviderAvailability {
    @Autowired
    public ProviderAvailabilityRepository providerAvailabilityRepository;
    @Override
    public ProviderAvailability saveProviderAvailability(ProviderAvailability availability) {
        return providerAvailabilityRepository.save(availability);
    }

    @Override
    public ProviderAvailability updateProviderAvailability(ProviderAvailability availability) {
        return providerAvailabilityRepository.saveAndFlush(availability);
    }

    @Override
    public boolean deleteProviderAvailability(Long id) {
        providerAvailabilityRepository.deleteById(id);
        return true;
    }

    @Override
    public List<ProviderAvailability> getList() {
        return providerAvailabilityRepository.findAll();
    }
}
