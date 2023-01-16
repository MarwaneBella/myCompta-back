package com.codingart.mycompta.model.general_infos;

import com.codingart.mycompta.model.client.Client;
import com.codingart.mycompta.model.client.Societe;
import com.codingart.mycompta.model.config.Profile;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String address;
    private String codePostal;
    private String city;
    private String Country;


//    Relation Between Address and Profile
    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

//    Relation Between Address and Client
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

//    Relation Between Address and Societe
    @OneToOne
    @JoinColumn(name = "societe_id")
    private Societe societe;

}