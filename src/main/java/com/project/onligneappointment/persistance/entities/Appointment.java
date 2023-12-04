package com.project.onligneappointment.persistance.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Appointment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date_hour;

    private String motive;

    private int status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User client;

    @ManyToOne
    private Provider provider;


}
