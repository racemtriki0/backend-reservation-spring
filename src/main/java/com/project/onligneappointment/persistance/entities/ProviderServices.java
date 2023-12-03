package com.project.onligneappointment.persistance.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ProviderServicesId.class)
public class ProviderServices implements Serializable {

    private Long id;
    @Id
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

    @Id
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;
}
