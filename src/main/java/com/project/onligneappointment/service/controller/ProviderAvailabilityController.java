package com.project.onligneappointment.service.controller;

import com.project.onligneappointment.persistance.entities.ProviderAvailability;
import com.project.onligneappointment.service.interfaces.IProviderAvailability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/availability")
public class ProviderAvailabilityController {
    @Autowired
    IProviderAvailability availabilityservice;
    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    ProviderAvailability save(@RequestBody ProviderAvailability pro){
        ProviderAvailability p = availabilityservice.saveProviderAvailability(pro);
        System.out.println("*******"+p.getDay_of_week());
        return p;
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    ProviderAvailability update(@RequestBody ProviderAvailability pro){
        return availabilityservice.updateProviderAvailability(pro);
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id){
        availabilityservice.deleteProviderAvailability(id);
        return true;
    }

    @GetMapping("/list")
    List<ProviderAvailability> getList(){
        return availabilityservice.getList();
    }
}
