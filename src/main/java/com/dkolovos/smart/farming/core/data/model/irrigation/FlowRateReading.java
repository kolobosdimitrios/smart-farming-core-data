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
 * Records a single flow‐rate measurement for a zone.
 * 
 */
public class FlowRateReading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "zone_id", nullable = false, length = 64)
    private String zoneId;

    @Column(name = "rate_lps", nullable = false)
    private float rateLitersPerSecond;

    @Column(name = "measured_at", nullable = false)
    private Instant timestamp;

    public FlowRateReading() {}

    public FlowRateReading(String zoneId, float rateLitersPerSecond, Instant timestamp) {
        this.zoneId = zoneId;
        this.rateLitersPerSecond = rateLitersPerSecond;
        this.timestamp = timestamp;
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

    public float getRateLitersPerSecond() {
        return rateLitersPerSecond;
    }

    public void setRateLitersPerSecond(float rateLitersPerSecond) {
        this.rateLitersPerSecond = rateLitersPerSecond;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
    
    
}
