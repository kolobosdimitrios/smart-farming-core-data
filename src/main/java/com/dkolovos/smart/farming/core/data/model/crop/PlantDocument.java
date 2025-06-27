package com.dkolovos.smart.farming.core.data.model.crop;

import org.bson.types.ObjectId;
import org.bson.codecs.pojo.annotations.BsonId;
import java.util.List;
import java.util.ArrayList;
import org.bson.codecs.pojo.annotations.BsonProperty;

/**
 * A plant stored in a NoSQL store (e.g. MongoDB).
 */
public class PlantDocument {
    @BsonId
    private ObjectId id;
    @BsonProperty("name")
    private String name;
    @BsonProperty("species")
    private String species;
    @BsonProperty("tags")
    private List<String> tags = new ArrayList<>();

    public PlantDocument() {
        // empty constructor required for POJO mapping
    }

    public PlantDocument(String name, String species) {
        this.id = new ObjectId();
        this.name = name;
        this.species = species;
    }
    
    public PlantDocument(String name, String species, List<String> tags) {
        this.id = new ObjectId();
        this.name = name;
        this.species = species;
        this.tags = tags;
    }

    public String getId() {
        return id != null ? id.toHexString() : null;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}

