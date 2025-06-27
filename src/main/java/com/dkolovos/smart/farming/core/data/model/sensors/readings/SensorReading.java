/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.model.sensors.readings;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.Instant;

/**
 *
 * @author dimitrioskolovos
 */
@Embeddable
public class SensorReading {

    
    @Column(name = "device_id", nullable = false)
    private String deviceId;
    @Column(name = "timestamp", nullable = false)
    private Instant timestamp;
    @Column(name = "battery_level", nullable = false)
    private int batteryLevel;
    @Column(name = "signal_level", nullable = false)
    private Integer signalLevel;

    public SensorReading() { //JPA needed.
    }

    public SensorReading(String deviceId, Instant timestamp, int batteryLevel, Integer signalLevel) {
        this.deviceId = deviceId;
        this.timestamp = timestamp;
        this.batteryLevel = batteryLevel;
        this.signalLevel = signalLevel;
    }


    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Integer getSignalLevel() {
        return signalLevel;
    }

    public void setSignalLevel(Integer signalLevel) {
        this.signalLevel = signalLevel;
    }
    
    

}
