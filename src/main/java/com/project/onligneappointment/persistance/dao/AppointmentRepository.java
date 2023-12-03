package com.project.onligneappointment.persistance.dao;


import com.project.onligneappointment.persistance.entities.Appointment;
import com.project.onligneappointment.persistance.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    Appointment saveAppointment(Appointment appointment);
    Appointment updateAppointment(Appointment appointment);
    boolean deleteAppointment(Long id);
    List<Appointment> getListAppointement(User user);
    Appointment findById(int id);

    @Query(value = "select count(*) from appointment",nativeQuery = true)
    int getQuantityOfAppointment();
    @Query(value = "select * from appointment where id= :id",nativeQuery = true)
    Appointment getAppointmentById(@Param("id") Long id);
}
