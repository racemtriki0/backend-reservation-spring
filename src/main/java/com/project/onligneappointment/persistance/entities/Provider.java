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
public class Provider implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company_name;
    private String service_description;
    private String localisation;
    private String other_info;
    @JsonIgnore
    @OneToMany(mappedBy="provider",fetch=FetchType.LAZY)
    private List<Appointment> appointments;
    @JsonIgnore
    @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY)
    private List<ProviderAvailability> providerAvailabilities;
    @JsonIgnore
    @OneToMany(mappedBy="provider",fetch=FetchType.LAZY)
    private List<ProviderServices> providerServices;
    @JsonIgnore
    @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY)
    private List<Reviews> reviews;

}
