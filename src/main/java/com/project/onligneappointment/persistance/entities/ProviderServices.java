package com.project.onligneappointment.persistance.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
/*@IdClass(ProviderServicesId.class)*/
public class ProviderServices implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String note;
    @ManyToOne
    private Provider provider;

    @ManyToOne
    private Services services;
}
