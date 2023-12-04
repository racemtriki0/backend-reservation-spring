package com.project.onligneappointment.persistance.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Provider implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String address;
    private String password;
    private String company_name;
    private String service_description;
    private String localisation;
    private String other_info;
    @ManyToOne
    private Role role;

}
