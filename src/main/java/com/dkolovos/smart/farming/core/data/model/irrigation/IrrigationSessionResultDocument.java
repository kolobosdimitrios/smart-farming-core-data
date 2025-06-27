/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.model.irrigation;

import java.time.Instant;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

/**
 *
 * @author dimitrioskolovos
 * 
 * Persisted summary of an irrigation session:
 * duration and total consumption can be computed in domain
 * or pre-calculated and stored here.
 * 
 * 
 */
public class IrrigationSessionResultDocument {
    @BsonId
    private ObjectId id;                    // Mongo’s _id

    @BsonProperty("zoneId")
    private String zoneId;                  // e.g. "zone-42"

    @BsonProperty("startTime")
    private Instant startTime;              // when the session began

    @BsonProperty("endTime")
    private Instant endTime;                // when the session ended

    @BsonProperty("waterConsumedLiters")
    private float waterConsumedLiters;      // total water used

    public IrrigationSessionResultDocument() {}

    public IrrigationSessionResultDocument(ObjectId id,
                                           String zoneId,
                                           Instant startTime,
                                           Instant endTime,
                                           float waterConsumedLiters) {
        this.id = id;
        this.zoneId = zoneId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.waterConsumedLiters = waterConsumedLiters;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
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

    public float getWaterConsumedLiters() {
        return waterConsumedLiters;
    }

    public void setWaterConsumedLiters(float waterConsumedLiters) {
        this.waterConsumedLiters = waterConsumedLiters;
    }
    
    

}
