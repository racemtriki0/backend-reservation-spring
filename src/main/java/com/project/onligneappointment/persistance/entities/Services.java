package com.project.onligneappointment.persistance.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Services implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private String service_description;
    private double price;
    private String service_duration;
    @JsonIgnore
    @OneToMany(mappedBy="services",fetch=FetchType.LAZY)
    private List<ProviderServices> providerServices;
    @ManyToOne
    private ServiceCategory serviceCategory;
}
