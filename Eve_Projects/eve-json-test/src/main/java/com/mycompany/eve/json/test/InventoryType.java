
package com.mycompany.eve.json.test;

public class InventoryType {

    private double capacity;
    private String description;
    private String portionSize_str;
    private int portionSize;
    private double volume;
    private Object dogma;
    private double radius;
    private String id_str;
    private boolean published;
    private double mass;
    private int id;
    private String name;

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPortionSize_str() {
        return portionSize_str;
    }

    public void setPortionSize_str(String portionSize_str) {
        this.portionSize_str = portionSize_str;
    }

    public int getPortionSize() {
        return portionSize;
    }

    public void setPortionSize(int portionSize) {
        this.portionSize = portionSize;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Object getDogma() {
        return dogma;
    }

    public void setDogma(Object dogma) {
        this.dogma = dogma;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getId_str() {
        return id_str;
    }

    public void setId_str(String id_str) {
        this.id_str = id_str;
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

    @Override
    public String toString() {
        return "InventoryType{" 
            + "capacity=" + capacity 
            + ", description=" + description 
            + ", portionSize_str=" + portionSize_str 
            + ", portionSize=" + portionSize 
            + ", volume=" + volume 
            + ", dogma=" + dogma 
            + ", radius=" + radius 
            + ", id_str=" + id_str 
            + ", published=" + published 
            + ", mass=" + mass 
            + ", id=" + id 
            + ", name=" + name + '}';
    }
      
}
