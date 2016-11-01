
package com.algerd.eve.crest.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * https://crest-tq.eveonline.com/inventory/groups/<id>/
 * @author Alex
 */
public class InventoryGroup2 {
    
    private int id;
    private String name;
    private String description;
    private boolean published;
      
    private InventoryCategory2 category;   
    private final List<InventoryType2> types = new ArrayList<>();
    
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

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InventoryCategory2 getCategory() {
        return category;
    }

    public void setCategory(InventoryCategory2 category) {
        this.category = category;
    }

    public List<InventoryType2> getTypes() {
        return types;
    }
      
}
