
package com.algerd.eve.crest.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * https://crest-tq.eveonline.com/inventory/categories/<id>/
 * @author Alex
 */
public class InventoryCategory2 {
    
    private int id;
    private String name;
    private boolean published;
    
    private List<InventoryGroup2> groups = new ArrayList<>();
    
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

    public List<InventoryGroup2> getGroups() {
        return groups;
    }
       
}
