package com.project.onligneappointment.service.controller;

import com.project.onligneappointment.persistance.entities.Provider;
import com.project.onligneappointment.service.interfaces.IProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/provider")
public class ProviderController {
    @Autowired
    IProvider providerservice;

    @PostMapping(value = "/save",consumes = "application/json", produces = "application/json")
    Provider save(@RequestBody Provider provider){
        return providerservice.saveProvider(provider);
    }

    @PutMapping(consumes = "application/json", produces = "application/json")
    Provider update(@RequestBody Provider provider){
        return providerservice.updateProvider(provider);
    }

    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id){
        providerservice.deleteProvider(id);
        return true;
    }

    @GetMapping("/list")
    List<Provider> getListProvider(){
        return providerservice.getListProvider();
    }
    @PostMapping(value = "/validate", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Provider validateProvider(@RequestBody Map<String, String> requestPayload) {
        String email = requestPayload.get("email");
        String password = requestPayload.get("password");
        return providerservice.validateProvider(email, password);
    }

}
