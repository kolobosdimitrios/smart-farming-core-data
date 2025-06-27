/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.model.sensors.readings;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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
@Table(name = "snow_sensor_reading")
public class SnowStatusSensorReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "is_snowing", nullable = false)
    private boolean isSnowing;
    @Column(name = "precipitation", nullable = false)
    private float precipitation;
    
    @Embedded
    private SensorReading sensorReading;

    public SnowStatusSensorReading() {
    }

    public SnowStatusSensorReading(boolean isSnowing, float precipitation, SensorReading sensorReading) {
        this.isSnowing = isSnowing;
        this.precipitation = precipitation;
        this.sensorReading = sensorReading;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isIsSnowing() {
        return isSnowing;
    }

    public void setIsSnowing(boolean isSnowing) {
        this.isSnowing = isSnowing;
    }

    public float getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(float precipitation) {
        this.precipitation = precipitation;
    }

    public SensorReading getSensorReading() {
        return sensorReading;
    }

    public void setSensorReading(SensorReading sensorReading) {
        this.sensorReading = sensorReading;
    }
    
    
}
