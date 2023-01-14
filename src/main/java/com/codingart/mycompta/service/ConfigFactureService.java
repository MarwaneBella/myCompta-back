package com.codingart.mycompta.service;

import com.codingart.mycompta.model.ConfigFacture;

import java.util.List;

public interface ConfigFactureService {
    ConfigFacture addConfigFacture(ConfigFacture configFacture);
    ConfigFacture getConfigFacture(Long id);
    List<ConfigFacture> getAllConfigFacture();
    ConfigFacture updateConfigFacture(Long id, ConfigFacture configFacture);
    void deleteConfigFacture(Long id);
}
