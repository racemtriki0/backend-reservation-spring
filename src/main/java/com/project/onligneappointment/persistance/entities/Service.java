package com.project.onligneappointment.persistance.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;
    private String service_description;
    private double price;
    private String service_duration;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private ServiceCategory serviceCategory;
}
