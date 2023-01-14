package com.codingart.mycompta.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FactureAcompte extends Facture{
    private double montantPayed;
    private char typeMontant;



}
