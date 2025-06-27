/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.model.crop;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author dimitrioskolovos
 */
@Entity
@Table(name="disease_alert")
public class DiseaseAlert {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;
    @Column(name = "plant_id", nullable = false, length = 24)
    private String plantId;
    @Column(name = "disease_name", nullable = false)
    private String diseaseName;
    @Column(name = "severity_score", nullable = false)
    private int severityScore;
    @Column(name = "suggest_treatment", nullable = true)
    private String suggestedTreatment;

    public DiseaseAlert() {
        /**
         * JPA requires no argument constructor
         */
    }

    public DiseaseAlert(long id, String plantId, String diseaseName, int severityScore, String suggestedTreatment) {
        this.id = id;
        this.plantId = plantId;
        this.diseaseName = diseaseName;
        this.severityScore = severityScore;
        this.suggestedTreatment = suggestedTreatment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public int getSeverityScore() {
        return severityScore;
    }

    public void setSeverityScore(int severityScore) {
        this.severityScore = severityScore;
    }

    public String getSuggestedTreatment() {
        return suggestedTreatment;
    }

    public void setSuggestedTreatment(String suggestedTreatment) {
        this.suggestedTreatment = suggestedTreatment;
    }
    
    
    
    
}
