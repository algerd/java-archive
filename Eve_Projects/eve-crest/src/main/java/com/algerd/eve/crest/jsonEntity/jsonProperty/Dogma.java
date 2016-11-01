
package com.algerd.eve.crest.jsonEntity.jsonProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * json-property : dogma
 * @author Alex
 */
public class Dogma {
    
    @JsonProperty("attributes") private List<AttributeItem> attributes;

    public List<AttributeItem> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeItem> attributes) {
        this.attributes = attributes;
    }

}
