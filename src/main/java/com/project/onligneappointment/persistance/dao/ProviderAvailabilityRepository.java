package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.ProviderAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProviderAvailabilityRepository extends JpaRepository<ProviderAvailability, Long> {
    @Query(value = "select count(*) from providerAvailability",nativeQuery = true)
    int getQuantityOfProviderAvailability();
}
