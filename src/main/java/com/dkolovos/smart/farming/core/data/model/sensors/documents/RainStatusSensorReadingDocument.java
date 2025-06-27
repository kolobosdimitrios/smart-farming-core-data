package com.dkolovos.smart.farming.core.data.model.sensors.documents;

import org.bson.types.ObjectId;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

/**
 * Rain sensor: isRaining flag, precipitation + reading metadata.
 */
public class RainStatusSensorReadingDocument {

    @BsonId
    private ObjectId id;

    @BsonProperty("isRaining")
    private boolean isRaining;

    @BsonProperty("precipitation")
    private float precipitation;

    @BsonProperty("sensorReading")
    private SensorReadingDocument sensorReading;

    public RainStatusSensorReadingDocument() {}

    public RainStatusSensorReadingDocument(ObjectId id,
                                           boolean isRaining,
                                           float precipitation,
                                           SensorReadingDocument sensorReading) {
        this.id            = id;
        this.isRaining     = isRaining;
        this.precipitation = precipitation;
        this.sensorReading = sensorReading;
    }

    public ObjectId getId()                  { return id; }
    public void     setId(ObjectId id)       { this.id = id; }

    public boolean  isRaining()              { return isRaining; }
    public void     setIsRaining(boolean isRaining) { this.isRaining = isRaining; }

    public float    getPrecipitation()       { return precipitation; }
    public void     setPrecipitation(float precipitation) { this.precipitation = precipitation; }

    public SensorReadingDocument getSensorReading()   { return sensorReading; }
    public void setSensorReading(SensorReadingDocument sensorReading) { this.sensorReading = sensorReading; }
}
