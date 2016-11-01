
package com.algerd.eve.crest.jsonEntity.jsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * json-property list
 * @author Alex
 */
@JsonIgnoreProperties({ "id_str" })
public class Item {
    
    @JsonProperty("id") private int id;  
    @JsonProperty("href") private String href;  
    @JsonProperty("name") private String name;
  
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
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

}
