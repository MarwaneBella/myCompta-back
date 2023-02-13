package com.codingart.mycompta.model.facture;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FactureAvoir extends Facture{

    private double remise;
    private char TypeRemise;
    private boolean isDestined;
}
