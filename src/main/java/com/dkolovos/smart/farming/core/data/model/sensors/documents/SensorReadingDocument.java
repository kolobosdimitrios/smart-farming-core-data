package com.dkolovos.smart.farming.core.data.model.sensors.documents;

import org.bson.codecs.pojo.annotations.BsonProperty;
import java.time.Instant;

/**
 * Embedded metadata for any sensor reading.
 */
public class SensorReadingDocument {

    @BsonProperty("deviceId")
    private String deviceId;

    @BsonProperty("timestamp")
    private Instant timestamp;

    @BsonProperty("batteryLevel")
    private int batteryLevel;

    @BsonProperty("signalLevel")
    private Integer signalLevel;

    public SensorReadingDocument() {}

    public SensorReadingDocument(String deviceId,
                                 Instant timestamp,
                                 int batteryLevel,
                                 Integer signalLevel) {
        this.deviceId     = deviceId;
        this.timestamp    = timestamp;
        this.batteryLevel = batteryLevel;
        this.signalLevel  = signalLevel;
    }

    public String getDeviceId()     { return deviceId; }
    public void   setDeviceId(String deviceId) { this.deviceId = deviceId; }

    public Instant getTimestamp()   { return timestamp; }
    public void    setTimestamp(Instant timestamp) { this.timestamp = timestamp; }

    public int     getBatteryLevel(){ return batteryLevel; }
    public void    setBatteryLevel(int batteryLevel) { this.batteryLevel = batteryLevel; }

    public Integer getSignalLevel() { return signalLevel; }
    public void    setSignalLevel(Integer signalLevel) { this.signalLevel = signalLevel; }
}
