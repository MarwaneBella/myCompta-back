package com.codingart.mycompta.service;

import com.codingart.mycompta.model.ConditionReglement;

import java.util.List;

public interface ConditionReglementService {
    ConditionReglement addConditionReglement(ConditionReglement conditionReglement);
    ConditionReglement getConditionReglement(Long id);
    List<ConditionReglement> getAllConditionReglement();
    ConditionReglement updateConditionReglement(Long id, ConditionReglement conditionReglement);
    void deleteConditionReglement(Long id);
}
