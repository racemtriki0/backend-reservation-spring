package com.project.onligneappointment.service.implementations;

import com.project.onligneappointment.persistance.dao.AppointmentRepository;
import com.project.onligneappointment.persistance.entities.Appointment;
import com.project.onligneappointment.persistance.entities.User;
import com.project.onligneappointment.service.interfaces.IAppointment;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class AppointmentService implements IAppointment {
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Override
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment updateAppointment(Appointment appointment) {
        return appointmentRepository.saveAndFlush(appointment);
    }

    @Override
    public boolean deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Appointment> getListAppointement() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment findById(Long id) {
        return appointmentRepository.findById(id).get();
    }

    @Override
    public int getQuantityOfAppointment() {
        return appointmentRepository.getQuantityOfAppointment();
    }
}
