package com.project.onligneappointment.persistance.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String address;
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    private Provider provider;
    @ManyToOne
    private Role role;
    @JsonIgnore
    @OneToMany(mappedBy="client",fetch=FetchType.LAZY)
    private List<Appointment> appointments;


}

