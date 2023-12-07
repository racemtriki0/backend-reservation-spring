package com.project.onligneappointment.service.interfaces;

import com.project.onligneappointment.persistance.entities.Provider;

import java.util.List;

public interface IProvider {
    Provider saveProvider(Provider provider);
    Provider updateProvider(Provider provider);
    boolean deleteProvider(Long id);
    List<Provider> getListProvider();
    Provider validateProvider(String email, String password);

}
