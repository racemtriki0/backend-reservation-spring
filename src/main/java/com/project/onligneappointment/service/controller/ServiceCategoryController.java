package com.project.onligneappointment.service.controller;

import com.project.onligneappointment.persistance.entities.ServiceCategory;
import com.project.onligneappointment.service.interfaces.IServiceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class ServiceCategoryController {
    @Autowired
    IServiceCategory categoryservice;

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    ServiceCategory save(@RequestBody ServiceCategory cat){
        return categoryservice.saveServiceCategory(cat);

    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    ServiceCategory update(@RequestBody ServiceCategory cat){
        return categoryservice.updateServiceCategory(cat);
    }

    @GetMapping("/list")
    List<ServiceCategory> getList(){
        return categoryservice.getListCategory();
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id){
        categoryservice.deleteServiceCategory(id);
        return true;
    }
}
