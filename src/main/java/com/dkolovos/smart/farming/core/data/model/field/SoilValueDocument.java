/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.model.field;

import org.bson.codecs.pojo.annotations.BsonProperty;

/**
 *
 * @author dimitrioskolovos
 * Represents a single name→value pair in SoilDocument.
 */
public class SoilValueDocument {
    @BsonProperty("name")
    private String name;

    @BsonProperty("value")
    private Object value;

    public SoilValueDocument() {/** No-argument constructor needed by the PojoCodec */}

    public SoilValueDocument(String name, Object value) {
        this.name  = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
}
