
package com.algerd.eve.crest.jsonEntity;

import com.algerd.eve.crest.entity.InventoryCategory2;
import com.algerd.eve.crest.entity.InventoryType2;
import com.algerd.eve.crest.jsonEntity.jsonProperty.Href;
import com.algerd.eve.crest.jsonEntity.jsonProperty.Item;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * https://crest-tq.eveonline.com/inventory/groups/<id>/
 * @author Alex
 */
//@JsonIgnoreProperties(ignoreUnknown=true)
@JsonIgnoreProperties({ "id_str" })
public class InventoryGroup {
    
    @JsonProperty("id") private int id;
    @JsonProperty("name") private String name;
    @JsonProperty("category") private Href category;
    @JsonProperty("published") private boolean published;
    @JsonProperty("types") private List<Item> types;
    @JsonProperty("description") private String description;
    
    private InventoryCategory2 inventoryCategory;   
    private final List<InventoryType2> inventoryType = new ArrayList<>();

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

    public Href getCategory() {
        return category;
    }

    public void setCategory(Href category) {
        this.category = category;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public List<Item> getTypes() {
        return types;
    }

    public void setTypes(List<Item> types) {
        this.types = types;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InventoryCategory2 getInventoryCategory() {
        return inventoryCategory;
    }

    public void setInventoryCategory(InventoryCategory2 inventoryCategory) {
        this.inventoryCategory = inventoryCategory;
    }

    public List<InventoryType2> getInventoryType() {
        return inventoryType;
    }   
    
}
