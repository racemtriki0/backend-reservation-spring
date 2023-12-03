package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.Provider;
import com.project.onligneappointment.service.interfaces.IProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
