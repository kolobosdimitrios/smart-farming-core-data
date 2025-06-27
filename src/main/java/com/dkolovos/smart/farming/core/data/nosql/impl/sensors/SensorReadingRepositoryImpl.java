/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.nosql.impl.sensors;

import com.dkolovos.smart.farming.core.application.usecase.Result;
import com.dkolovos.smart.farming.core.domain.data.sensors.SensorReadingDto;
import com.dkolovos.smart.farming.core.domain.port.sensors.SensorReadingRepository;
import jakarta.persistence.EntityManagerFactory;
import java.time.Instant;

/**
 *
 * @author dimitrioskolovos
 */
public class SensorReadingRepositoryImpl implements SensorReadingRepository{
    
     private final EntityManagerFactory emf;

    public SensorReadingRepositoryImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Result save(SensorReadingDto reading) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Result findLatestByDeviceId(String deviceId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Result findAllByDeviceIdAndTimeRange(String deviceId, Instant start, Instant end) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Result exists(SensorReadingDto reading) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
