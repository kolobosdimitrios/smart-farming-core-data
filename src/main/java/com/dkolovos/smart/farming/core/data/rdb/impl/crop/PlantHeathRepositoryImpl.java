/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.rdb.impl.crop;

import com.dkolovos.smart.farming.core.application.usecase.Result;
import com.dkolovos.smart.farming.core.domain.data.crop.PlantHealthDto;
import com.dkolovos.smart.farming.core.domain.repository.crop.PlantHealthRepository;
import jakarta.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dimitrioskolovos
 */
public class PlantHeathRepositoryImpl implements PlantHealthRepository{
    
    private final EntityManagerFactory emf;

    public PlantHeathRepositoryImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Result<Void> insertPlantHealthRecord(PlantHealthDto plantHealth) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Result<Optional<List<PlantHealthDto>>> getPlantHealthRecords(String plantId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Result<Optional<List<PlantHealthDto>>> getAllPlantHealthRecords() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Result<Optional<List<PlantHealthDto>>> findByFieldOrCondition(String fieldId, String conditionType) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Result<Void> deletePlantHealthStatus(PlantHealthDto plantHealth) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
