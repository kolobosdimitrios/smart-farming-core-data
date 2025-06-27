package com.dkolovos.smart.farming.core.data.model.sensors.documents;

import org.bson.types.ObjectId;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

/**
 * Light sensor: intensity + reading metadata.
 */
public class LightSensorReadingDocument {

    @BsonId
    private ObjectId id;

    @BsonProperty("intensity")
    private float intensity;

    @BsonProperty("sensorReading")
    private SensorReadingDocument sensorReading;

    public LightSensorReadingDocument() {}

    public LightSensorReadingDocument(ObjectId id,
                                      float intensity,
                                      SensorReadingDocument sensorReading) {
        this.id            = id;
        this.intensity     = intensity;
        this.sensorReading = sensorReading;
    }

    public ObjectId getId()                   { return id; }
    public void     setId(ObjectId id)        { this.id = id; }

    public float    getIntensity()            { return intensity; }
    public void     setIntensity(float intensity) { this.intensity = intensity; }

    public SensorReadingDocument getSensorReading()   { return sensorReading; }
    public void setSensorReading(SensorReadingDocument sensorReading) { this.sensorReading = sensorReading; }
}
