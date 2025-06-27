/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.rdb.impl.crop;

import com.dkolovos.smart.farming.core.application.usecase.Result;
import com.dkolovos.smart.farming.core.domain.data.crop.DiseaseAlertDto;
import com.dkolovos.smart.farming.core.domain.repository.crop.DiseaseAlertRepository;
import jakarta.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dimitrioskolovos
 */
public class DiseaseAlertRepositoryImpl implements DiseaseAlertRepository {

    private final EntityManagerFactory emf;

    public DiseaseAlertRepositoryImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Result<Void> insertDiseaseAlert(DiseaseAlertDto diseaseAlert) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Result<Optional<List<DiseaseAlertDto>>> getDiseaseAlerts() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Result<Void> updateDiseaseAlert(DiseaseAlertDto diseaseAlert) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Result<Void> deleteDiseaseAlert(DiseaseAlertDto diseaseAlert) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
