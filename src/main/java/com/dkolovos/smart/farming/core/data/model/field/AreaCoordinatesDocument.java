/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.model.field;

import org.bson.codecs.pojo.annotations.BsonProperty;

/**
 * @author dimitrioskolovos
 * Simple container for latitude/longitude arrays in MongoDB.
 */
public class AreaCoordinatesDocument {

    @BsonProperty("lat")
    private double[] lat;

    @BsonProperty("lng")
    private double[] lng;

    /** No-argument constructor for PojoCodec */
    public AreaCoordinatesDocument() {}

    public AreaCoordinatesDocument(double[] lat, double[] lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double[] getLat() {
        return lat;
    }

    public void setLat(double[] lat) {
        this.lat = lat;
    }

    public double[] getLng() {
        return lng;
    }

    public void setLng(double[] lng) {
        this.lng = lng;
    }
}
