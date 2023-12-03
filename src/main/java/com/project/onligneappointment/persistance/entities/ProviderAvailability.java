package com.project.onligneappointment.persistance.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProviderAvailability implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long availabilityID;

    @ManyToOne
    private Provider provider;

    private String day_of_week;
    private String start_time;
    private String end_time;
}
