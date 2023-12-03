package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.Provider;
import com.project.onligneappointment.service.interfaces.IProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
    Provider saveProvider(Provider provider);
    Provider updateProvider(Provider provider);
    boolean deleteProvider(Long id);
    Provider validateProvider(String email, String password);

    Provider findByEmailAndPassword(String email, String password);

    Integer getCountByEmail(String email);

    Provider findById(Integer providerId);
}
