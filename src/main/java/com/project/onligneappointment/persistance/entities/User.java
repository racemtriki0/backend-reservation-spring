package com.project.onligneappointment.persistance.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    private String address;
    private String password;
    @JsonIgnore
    @OneToMany(mappedBy="client",fetch=FetchType.LAZY)
    private List<Appointment> appointmentList;


}

