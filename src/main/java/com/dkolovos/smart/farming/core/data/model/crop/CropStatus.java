/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.model.crop;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

/**
 *
 * @author dimitrioskolovos
 */
/**
 * JPA entity representing the status of a crop in a specific field.
 */
@Entity
@Table(name = "crop_status")
public class CropStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;

    @Column(name = "field_id", nullable = false)
    private String fieldId;

    @Enumerated(EnumType.STRING)
    @Column(name = "stage", nullable = false)
    private CropStage stage;

    @Column(name = "days_to_next_stage")
    private int daysToNextStage;

    @Column(name = "predicted_harvest_date")
    private LocalDate predictedHarvestDate;

    @Column(name = "plant_id", nullable = false)
    private String plantId;

    // Default constructor for JPA
    protected CropStatus() {
    }

    public CropStatus(long id, String fieldId, CropStage stage, int daysToNextStage,
            LocalDate predictedHarvestDate, String plantId) {
        this.id = id;
        this.fieldId = fieldId;
        this.stage = stage;
        this.daysToNextStage = daysToNextStage;
        this.predictedHarvestDate = predictedHarvestDate;
        this.plantId = plantId;
    }

    public long getId() {
        return id;
    }

    public String getFieldId() {
        return fieldId;
    }

    public CropStage getStage() {
        return stage;
    }

    public int getDaysToNextStage() {
        return daysToNextStage;
    }

    public LocalDate getPredictedHarvestDate() {
        return predictedHarvestDate;
    }

    public String getPlantId() {
        return plantId;
    }

    public void setStage(CropStage stage) {
        this.stage = stage;
    }

    public void setDaysToNextStage(int daysToNextStage) {
        this.daysToNextStage = daysToNextStage;
    }

    public void setPredictedHarvestDate(LocalDate predictedHarvestDate) {
        this.predictedHarvestDate = predictedHarvestDate;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId;
    }
}
