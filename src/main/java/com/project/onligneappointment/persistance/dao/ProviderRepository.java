package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.Provider;
import com.project.onligneappointment.service.interfaces.IProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
    @Query(value = "select count(*) from provider",nativeQuery = true)
    int getQuantityOfProvider();
    //Provider validateProvider(String email, String password);

    Provider findByEmailAndPassword(String email, String password);

}
