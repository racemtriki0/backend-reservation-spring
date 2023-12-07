package com.project.onligneappointment.service.implementations;

import com.project.onligneappointment.persistance.dao.ProviderRepository;
import com.project.onligneappointment.persistance.entities.Provider;
import com.project.onligneappointment.service.interfaces.IProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService implements IProvider {
    @Autowired
    ProviderRepository providerRepository;
    @Override
    public Provider saveProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    @Override
    public Provider updateProvider(Provider provider) {
        return providerRepository.saveAndFlush(provider);
    }

    @Override
    public boolean deleteProvider(Long id) {
        providerRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Provider> getListProvider() {
        return providerRepository.findAll();
    }

    @Override
    public Provider validateProvider(String email, String password) {
        return providerRepository.findByEmailAndPassword(email,password);
    }
}
