package com.codingart.mycompta.model.config;

import com.codingart.mycompta.model.client.Client;
import com.codingart.mycompta.model.environment.Environment;
import com.codingart.mycompta.model.facture.FactureAcompte;
import com.codingart.mycompta.model.facture.FactureSimple;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

//@JsonIdentityInfo(scope = CompteBanc.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompteBanc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "IBAN may not be blank")
    private String iban;
    @NotBlank(message = "BIC may not be blank")
    private String bic;
    @NotBlank(message = "Titulaire IBAN may not be blank")
    private String titulaire;
    @NotBlank(message = "LibelleCompte may not be blank")
    private String libelleCompte;


    //    Relation between CompteBanc and Environment
    @ManyToOne
    @JoinColumn(name = "environment_id")
    private Environment environment;

    //    Relation between compteBanc and FactureAcompte
    @OneToOne
    @JoinColumn(name = "factureAcompte_id")
    private FactureAcompte factureAcompte;

}
