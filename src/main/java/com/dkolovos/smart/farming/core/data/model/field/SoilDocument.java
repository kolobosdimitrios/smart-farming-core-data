/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.model.field;

import java.util.ArrayList;
import java.util.List;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

/**
 *
 * @author dimitrioskolovos
 * 
 * A soil record stored in MongoDB.
 * Represent a soil type.
 */
public class SoilDocument {
    @BsonId
    private ObjectId id;

    @BsonProperty("name")
    private String name;

    @BsonProperty("status")
    private String status;

    @BsonProperty("score")
    private float score;

    @BsonProperty("soilValues")
    private List<SoilValueDocument> soilValues = new ArrayList<>();

    public SoilDocument() {/** No argument constructor needed by the PojoCodec */}

    public SoilDocument(ObjectId id,
                        String name,
                        String status,
                        float score,
                        List<SoilValueDocument> soilValues) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.score = score;
        this.soilValues = soilValues != null ? soilValues : new ArrayList<>();
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

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }

    public List<SoilValueDocument> getSoilValues() {
        return soilValues;
    }
    public void setSoilValues(List<SoilValueDocument> soilValues) {
        this.soilValues = soilValues;
    }
}
