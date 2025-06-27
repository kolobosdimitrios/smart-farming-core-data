package com.dkolovos.smart.farming.core.data.model.sensors.documents;

import org.bson.types.ObjectId;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

/**
 * Snow sensor: isSnowing flag, precipitation + reading metadata.
 */
public class SnowStatusSensorReadingDocument {

    @BsonId
    private ObjectId id;

    @BsonProperty("isSnowing")
    private boolean isSnowing;

    @BsonProperty("precipitation")
    private float precipitation;

    @BsonProperty("sensorReading")
    private SensorReadingDocument sensorReading;

    public SnowStatusSensorReadingDocument() {}

    public SnowStatusSensorReadingDocument(ObjectId id,
                                           boolean isSnowing,
                                           float precipitation,
                                           SensorReadingDocument sensorReading) {
        this.id            = id;
        this.isSnowing     = isSnowing;
        this.precipitation = precipitation;
        this.sensorReading = sensorReading;
    }

    public ObjectId getId()                  { return id; }
    public void     setId(ObjectId id)       { this.id = id; }

    public boolean  isSnowing()              { return isSnowing; }
    public void     setIsSnowing(boolean isSnowing) { this.isSnowing = isSnowing; }

    public float    getPrecipitation()       { return precipitation; }
    public void     setPrecipitation(float precipitation) { this.precipitation = precipitation; }

    public SensorReadingDocument getSensorReading()   { return sensorReading; }
    public void setSensorReading(SensorReadingDocument sensorReading) { this.sensorReading = sensorReading; }
}
