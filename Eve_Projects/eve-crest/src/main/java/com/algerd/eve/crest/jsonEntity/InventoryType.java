
package com.algerd.eve.crest.jsonEntity;

import com.algerd.eve.crest.entity.DogmaAttribute2;
import com.algerd.eve.crest.entity.InventoryGroup2;
import com.algerd.eve.crest.jsonEntity.jsonProperty.Dogma;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * https://crest-tq.eveonline.com/inventory/types/<id>/
 * @author Alex
 */
//@JsonIgnoreProperties(ignoreUnknown=true)
@JsonIgnoreProperties({ "id_str", "iconID_str", "portionSize_str" })
public class InventoryType {
    
    @JsonProperty("id") private int id;   
    @JsonProperty("name") private String name;   
    @JsonProperty("description") private String description;   
    @JsonProperty("capacity") private double capacity;  
    @JsonProperty("portionSize") private int portionSize;  
    @JsonProperty("iconID") private int iconID;
    @JsonProperty("volume") private double volume;   
    @JsonProperty("dogma") private Dogma dogma;  
    @JsonProperty("radius") private double radius;    
    @JsonProperty("published") private boolean published;    
    @JsonProperty("mass") private double mass;
    
    private InventoryGroup2 inventoryGroup;
    private final Map<DogmaAttribute2, Integer> dogmaMap = new HashMap<>();
    
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
  
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
      
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
     
    public int getPortionSize() {
        return portionSize;
    }
    public void setPortionSize(int portionSize) {
        this.portionSize = portionSize;
    }
     
    public int getIconID() {
        return iconID;
    }
    public void setIconID(int iconID) {
        this.iconID = iconID;
    }
        
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
  
    public Dogma getDogma() {
        return dogma;
    }
    public void setDogma(Dogma dogma) {
        this.dogma = dogma;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public boolean isPublished() {
        return published;
    }
    public void setPublished(boolean published) {
        this.published = published;
    }

    public double getMass() {
        return mass;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }  

    public InventoryGroup2 getInventoryGroup() {
        return inventoryGroup;
    }

    public void setInventoryGroup(InventoryGroup2 inventoryGroup) {
        this.inventoryGroup = inventoryGroup;
    }

    public Map<DogmaAttribute2, Integer> getDogmaMap() {
        return dogmaMap;
    }   
    
}
