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
@Table(name = "soil_sensor_reading")
public class SoilSensorReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "temperature", nullable = false)
    private float temperature;
    @Column(name = "moisture", nullable = false)
    private float moisture;
    @Column(name = "pH", nullable = false)
    private float pH;
    
    @Embedded
    private SensorReading sensorReading;

    public SoilSensorReading() {
    }

    public SoilSensorReading(float temperature, float moisture, float pH, SensorReading sensorReading) {
        this.temperature = temperature;
        this.moisture = moisture;
        this.pH = pH;
        this.sensorReading = sensorReading;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getMoisture() {
        return moisture;
    }

    public void setMoisture(float moisture) {
        this.moisture = moisture;
    }

    public float getpH() {
        return pH;
    }

    public void setpH(float pH) {
        this.pH = pH;
    }

    public SensorReading getSensorReading() {
        return sensorReading;
    }

    public void setSensorReading(SensorReading sensorReading) {
        this.sensorReading = sensorReading;
    }
    
    
}
