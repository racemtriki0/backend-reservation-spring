package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ServicesRepository extends JpaRepository<Services, Long> {

    @Query(value = "select count(*) from service",nativeQuery = true)
    int getQuantityOfService();
    @Query(value = "select * from service where id= :id",nativeQuery = true)
    Services getServiceById(@Param("id") Long id);
}
