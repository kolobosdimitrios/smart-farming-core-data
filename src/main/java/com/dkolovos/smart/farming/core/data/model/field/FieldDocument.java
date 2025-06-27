/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.model.field;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

/**
 *
 * @author dimitrioskolovos
 * Top-level MongoDB document for a Field.
 */
public class FieldDocument {
    @BsonId
    private ObjectId id;

    @BsonProperty("name")
    private String name;

    /**
     * Just stores the raw coordinates; domain will translate this into
     * a RectangularArea or MixedShapeArea for any surface calculation.
     */
    @BsonProperty("area")
    private AreaCoordinatesDocument area;

    public FieldDocument() {}

    public FieldDocument(ObjectId id, String name, AreaCoordinatesDocument area) {
        this.id   = id;
        this.name = name;
        this.area = area;
    }

    public ObjectId getId() {
        return id;
    }
    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public AreaCoordinatesDocument getArea() {
        return area;
    }
    public void setArea(AreaCoordinatesDocument area) {
        this.area = area;
    }
}
