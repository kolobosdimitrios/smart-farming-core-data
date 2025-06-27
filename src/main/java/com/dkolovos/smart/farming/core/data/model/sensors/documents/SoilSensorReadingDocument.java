package com.dkolovos.smart.farming.core.data.model.sensors.documents;

import org.bson.types.ObjectId;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

/**
 * Soil sensor: temp, moisture, pH + reading metadata.
 */
public class SoilSensorReadingDocument {

    @BsonId
    private ObjectId id;

    @BsonProperty("temperature")
    private float temperature;

    @BsonProperty("moisture")
    private float moisture;

    @BsonProperty("pH")
    private float pH;

    @BsonProperty("sensorReading")
    private SensorReadingDocument sensorReading;

    public SoilSensorReadingDocument() {}

    public SoilSensorReadingDocument(ObjectId id,
                                     float temperature,
                                     float moisture,
                                     float pH,
                                     SensorReadingDocument sensorReading) {
        this.id            = id;
        this.temperature   = temperature;
        this.moisture      = moisture;
        this.pH            = pH;
        this.sensorReading = sensorReading;
    }

    public ObjectId getId()                   { return id; }
    public void     setId(ObjectId id)        { this.id = id; }

    public float    getTemperature()          { return temperature; }
    public void     setTemperature(float temperature) { this.temperature = temperature; }

    public float    getMoisture()             { return moisture; }
    public void     setMoisture(float moisture) { this.moisture = moisture; }

    public float    getPH()                   { return pH; }
    public void     setPH(float pH)           { this.pH = pH; }

    public SensorReadingDocument getSensorReading()   { return sensorReading; }
    public void setSensorReading(SensorReadingDocument sensorReading) { this.sensorReading = sensorReading; }
}
