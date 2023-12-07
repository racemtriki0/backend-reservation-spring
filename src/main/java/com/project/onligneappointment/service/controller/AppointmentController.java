package com.project.onligneappointment.service.controller;

import com.project.onligneappointment.persistance.entities.Appointment;
import com.project.onligneappointment.service.interfaces.IAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
    @Autowired
    IAppointment appointmentservice;

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    Appointment save(@RequestBody Appointment app){
        return appointmentservice.saveAppointment(app);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    Appointment update(@RequestBody Appointment app){
        return appointmentservice.updateAppointment(app);
    }

    @GetMapping("/list")
    List<Appointment> getList(){
        return appointmentservice.getListAppointement();
    }

    @GetMapping("/delete/{id}")
    boolean delete(@PathVariable Long id){
        appointmentservice.deleteAppointment(id);
        return true;
    }
}
