/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.model.irrigation;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.Instant;

/**
 *
 * @author dimitrioskolovos
 * 
 * Represents one irrigation event: when it started, ended,
 * who triggered it, and how much water was used.
 * 
 * 
 */
public class IrrigationEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "zone_id", nullable = false, length = 64)
    private String zoneId;

    @Column(name = "started_at", nullable = false)
    private Instant startTime;

    @Column(name = "ended_at", nullable = false)
    private Instant endTime;

    @Column(name = "triggered_by", nullable = false, length = 64)
    private String triggeredById;

    @Column(name = "water_used_liters", nullable = false)
    private float waterVolumeUsed;

    public IrrigationEvent() {}

    public IrrigationEvent(String zoneId,
                                 Instant startTime,
                                 Instant endTime,
                                 String triggeredById,
                                 float waterVolumeUsed) {
        this.zoneId         = zoneId;
        this.startTime      = startTime;
        this.endTime        = endTime;
        this.triggeredById  = triggeredById;
        this.waterVolumeUsed= waterVolumeUsed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }

    public String getTriggeredById() {
        return triggeredById;
    }

    public void setTriggeredById(String triggeredById) {
        this.triggeredById = triggeredById;
    }

    public float getWaterVolumeUsed() {
        return waterVolumeUsed;
    }

    public void setWaterVolumeUsed(float waterVolumeUsed) {
        this.waterVolumeUsed = waterVolumeUsed;
    }
    
    
}
