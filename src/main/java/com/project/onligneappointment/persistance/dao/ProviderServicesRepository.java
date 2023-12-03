package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.ProviderServices;
import com.project.onligneappointment.service.interfaces.IProviderServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProviderServicesRepository extends JpaRepository<ProviderServices, Long> {
    ProviderServices findById(int id);


    @Query(value = "select count(*) from providerServices",nativeQuery = true)
    int getQuantityOfProviderServices();
    @Query(value = "select * from rendezvous where id= :id",nativeQuery = true)
    ProviderServices getProviderServicesById(@Param("id") Long id);
}
