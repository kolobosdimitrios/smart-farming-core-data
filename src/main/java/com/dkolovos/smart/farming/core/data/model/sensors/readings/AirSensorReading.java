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
@Table(name="air_sensor_reading")
public class AirSensorReading {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "temperature", nullable = false)
    private float temperature;
    @Column(name = "humidity", nullable = false)
    private float humidity;
    @Column(name = "co_2_level", nullable = false)
    private Float co2Level;
    
    @Embedded
    private SensorReading sensorReading;

    public AirSensorReading() {
    }

    public AirSensorReading(float temperature, float humidity, Float co2Level, SensorReading sensorReading) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.co2Level = co2Level;
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

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public Float getCo2Level() {
        return co2Level;
    }

    public void setCo2Level(Float co2Level) {
        this.co2Level = co2Level;
    }

    public SensorReading getSensorReading() {
        return sensorReading;
    }

    public void setSensorReading(SensorReading sensorReading) {
        this.sensorReading = sensorReading;
    }
    
    
    
}
