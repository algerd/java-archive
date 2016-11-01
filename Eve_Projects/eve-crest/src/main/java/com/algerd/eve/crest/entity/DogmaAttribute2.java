
package com.algerd.eve.crest.entity;

import com.algerd.eve.crest.jsonEntity.DogmaAttribute;

/**
 * https://crest-tq.eveonline.com/dogma/attributes/<id>/
 * @author Alex
 */
public class DogmaAttribute2 {
    
    private int id;
    private String name;
    private String displayName;
    private String description;   
    private int iconID;
    private int unitID;
    private boolean highIsGood;
    private boolean stackable;
    private double defaultValue;
    private boolean published;
    
    public DogmaAttribute2() { 
        super();
    }
    
    public DogmaAttribute2(DogmaAttribute daj) {
        id = daj.getId();
        name = daj.getName();
        displayName = daj.getDisplayName();
        iconID = daj.getIconID();
        unitID = daj.getUnitID();
        highIsGood = daj.isHighIsGood();
        stackable = daj.isStackable();
        defaultValue = daj.getDefaultValue();
        published = daj.isPublished();
    }

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
