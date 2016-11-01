
package com.algerd.eve.crest.jsonEntity;

import com.algerd.eve.crest.entity.InventoryGroup2;
import com.algerd.eve.crest.jsonEntity.jsonProperty.Item;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * https://crest-tq.eveonline.com/inventory/categories/<id>/
 * @author Alex
 */
//@JsonIgnoreProperties(ignoreUnknown=true)
@JsonIgnoreProperties({ "id_str" })
public class InventoryCategory {
    
    @JsonProperty("id") private int id;
    @JsonProperty("name") private String name;
    @JsonProperty("groups") private List<Item> groups;
    @JsonProperty("published") private boolean published;
    
    private List<InventoryGroup2> inventoryGroups = new ArrayList<>();

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

    public List<Item> getGroups() {
        return groups;
    }

    public void setGroups(List<Item> groups) {
        this.groups = groups;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public List<InventoryGroup2> getInventoryGroups() {
        return inventoryGroups;
    }
    
}
