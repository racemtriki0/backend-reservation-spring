package com.project.onligneappointment.persistance.dao;


import com.project.onligneappointment.persistance.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}