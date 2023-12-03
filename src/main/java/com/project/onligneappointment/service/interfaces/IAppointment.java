package com.project.onligneappointment.service.interfaces;

import com.project.onligneappointment.persistance.entities.Appointment;
import com.project.onligneappointment.persistance.entities.User;

import java.util.List;

public interface IAppointment {
    Appointment saveAppointment(Appointment appointment);
    Appointment updateAppointment(Appointment appointment);
    boolean deleteAppointment(Long id);
    List<Appointment> getListAppointement(User user);
    Appointment findById(Long id);

    int getQuantityOfAppointment();
}
