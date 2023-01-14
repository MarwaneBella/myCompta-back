package com.codingart.mycompta.service;

import com.codingart.mycompta.model.FactureAvoir;

import java.util.List;

public interface FactureAvoirService {
    FactureAvoir addFactureAvoir(FactureAvoir factureAvoir);
    FactureAvoir getFactureAvoir(Long id);
    List<FactureAvoir> getAllFactureAvoir();
    FactureAvoir updateFactureAvoir(Long id, FactureAvoir factureAvoir);
    void deleteFactureAvoir(Long id);
}
