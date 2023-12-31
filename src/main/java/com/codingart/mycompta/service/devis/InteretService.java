package com.codingart.mycompta.service.devis;

import com.codingart.mycompta.model.devis.Interet;

import java.util.List;

public interface InteretService {

    void initInterets();
    Interet addInteret(Interet interet);
    Interet getInteret(Long id);
    List<Interet> getAllInteret();
    Interet updateInteret(Long id, Interet interet);
    void deleteInteret(Long id);
}
