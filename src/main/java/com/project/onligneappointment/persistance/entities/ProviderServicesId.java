package com.project.onligneappointment.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
public class ProviderServicesId implements Serializable {
    private Long provider;
    private Long service;

    // Getters and setters (assurez-vous de les implémenter)

    // Note : equals() et hashCode() doivent également être implémentés

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderServicesId that = (ProviderServicesId) o;
        return Objects.equals(provider, that.provider) && Objects.equals(service, that.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, service);
    }
}

