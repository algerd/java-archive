
package com.algerd.eve.crest.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * https://crest-tq.eveonline.com/inventory/types/<id>/
 * @author Alex
 */
public class InventoryType2 {
    
    private int id;   
    private String name;   
    private String description;   
    private double capacity;  
    private int portionSize;  
    private int iconID;
    private double volume;   
    private double radius;    
    private boolean published;    
    private double mass;
    
    private InventoryGroup2 group;
    private Map<DogmaAttribute2, Integer> dogma = new HashMap<>();
    
    
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

    public InventoryGroup2 getGroup() {
        return group;
    }

    public void setGroup(InventoryGroup2 group) {
        this.group = group;
    }
      
    public Map<DogmaAttribute2, Integer> getDogma() {
        return dogma;
    }
    
}
