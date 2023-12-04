package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.ProviderAvailability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderAvailabilityRepository extends JpaRepository<ProviderAvailability, Long> {
    ProviderAvailability save(ProviderAvailability availability);
    ProviderAvailability update(ProviderAvailability availability);
    boolean delete(Long id);
}
