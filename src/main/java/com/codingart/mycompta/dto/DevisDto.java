package com.codingart.mycompta.dto;

import com.codingart.mycompta.model.article.Article;
import com.codingart.mycompta.model.devis.ConditionReglement;
import com.codingart.mycompta.model.devis.Interet;
import com.codingart.mycompta.model.devis.ModeReglement;
import com.codingart.mycompta.enums.DevisStatus;
import com.codingart.mycompta.model.general_infos.MotCle;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * A DTO for the {@link com.codingart.mycompta.model.devis.Devis} entity
 */
@Data
public class DevisDto implements Serializable {
    private Long id;
    private String slug;
    private String code;
    private int validationDuration;
    private String devise;
    private double remise;
    private boolean remIsPercentage;
    private String textIntro;
    private String textCond;
    private String piedPage;
    private String condVente;
    private double totalHT;
    private double totalTTC;
    private DevisStatus status ;
    private Date date;
    private List<MotCle> motCleList;
    private List<Article> articleList;
//    private List<Facture> factureList;
    private SocieteDto societe;
    private ClientDto client;
    private ConditionReglement conditionReglement;
    private ModeReglement modeReglement;
    private Interet interet;
}