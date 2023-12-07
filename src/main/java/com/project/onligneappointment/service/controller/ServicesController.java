package com.project.onligneappointment.service.controller;

import com.project.onligneappointment.persistance.entities.Services;
import com.project.onligneappointment.service.interfaces.IServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServicesController {
    @Autowired
    IServices services;

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    Services save(@RequestBody Services ser){
        return services.saveServicePro(ser);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes="application/json", produces = "application/json")
    Services update(@RequestBody Services ser){
        return services.updateServicePro(ser);
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id){
        services.deleteServicePro(id);
        return true;
    }

    @GetMapping("/list")
    List<Services> getList(){
        return services.getListServicePro();
    }

    @GetMapping("/get/{id}")
    Services getReviewsById(@PathVariable Long id){
        return services.findServiceProById(id);
    }

    @GetMapping("/quantity")
    int getQuantity(){
        return services.getQuantityOfService();
    }
}
