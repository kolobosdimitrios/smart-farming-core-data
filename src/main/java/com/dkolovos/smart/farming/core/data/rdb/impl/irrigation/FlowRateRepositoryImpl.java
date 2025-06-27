/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.rdb.impl.irrigation;

import com.dkolovos.smart.farming.core.application.usecase.Result;
import com.dkolovos.smart.farming.core.domain.data.irrigation.FlowRateReadingDto;
import com.dkolovos.smart.farming.core.domain.repository.irrigation.FlowRateRepository;
import jakarta.persistence.EntityManagerFactory;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dimitrioskolovos
 */
public class FlowRateRepositoryImpl implements FlowRateRepository{
    
    private final EntityManagerFactory emf;

    public FlowRateRepositoryImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Result<Void> insertFlowRateReading(FlowRateReadingDto flowRateReading) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Result<Optional<List<FlowRateReadingDto>>> getReadings(String zoneId, Instant start, Instant end) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Result<Void> deleteFlowRateReading(FlowRateReadingDto flowRateReading) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
