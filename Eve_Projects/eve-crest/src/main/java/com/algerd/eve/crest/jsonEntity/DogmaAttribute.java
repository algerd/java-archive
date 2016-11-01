
package com.algerd.eve.crest.jsonEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * https://crest-tq.eveonline.com/dogma/attributes/<id>/
 * @author Alex
 */
//@JsonIgnoreProperties(ignoreUnknown=true)
@JsonIgnoreProperties({ "id_str", "iconID_str", "unitID_str" })
public class DogmaAttribute {
    
    @JsonProperty("id") private int id;
    @JsonProperty("name") private String name;
    @JsonProperty("displayName") private String displayName;
    @JsonProperty("description") private String description;   
    @JsonProperty("iconID") private int iconID;
    @JsonProperty("unitID") private int unitID;
    @JsonProperty("highIsGood") private boolean highIsGood;
    @JsonProperty("stackable") private boolean stackable;
    @JsonProperty("defaultValue") private double defaultValue;
    @JsonProperty("published") private boolean published;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIconID() {
        return iconID;
    }

    public void setIconID(int iconID) {
        this.iconID = iconID;
    }

    public int getUnitID() {
        return unitID;
    }

    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    public boolean isHighIsGood() {
        return highIsGood;
    }

    public void setHighIsGood(boolean highIsGood) {
        this.highIsGood = highIsGood;
    }

    public boolean isStackable() {
        return stackable;
    }

    public void setStackable(boolean stackable) {
        this.stackable = stackable;
    }

    public double getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(double defaultValue) {
        this.defaultValue = defaultValue;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }
    
    
}
