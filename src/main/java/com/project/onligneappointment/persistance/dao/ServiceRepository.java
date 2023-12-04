package com.project.onligneappointment.persistance.dao;

import com.project.onligneappointment.persistance.entities.Provider;
import com.project.onligneappointment.persistance.entities.Reviews;
import com.project.onligneappointment.persistance.entities.Service;
import com.project.onligneappointment.service.interfaces.IService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    Service save(Service service);
    Service update(Service service);
    boolean delete(Long id);
    List<Service> getList(Provider provider);
    Service findById(long id);

    @Query(value = "select count(*) from service",nativeQuery = true)
    int getQuantityOfService();
    @Query(value = "select * from service where id= :id",nativeQuery = true)
    Service getServiceById(@Param("id") Long id);
}
