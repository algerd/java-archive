
package com.algerd.eve.crest.jsonEntity.jsonProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * json-property list.
 * @author Alex
 */
public class AttributeItem {
    
    @JsonProperty("attribute") private Item attribute;  
    @JsonProperty("value") private int value;

    public Item getAttribute() {
        return attribute;
    }

    public void setAttribute(Item attribute) {
        this.attribute = attribute;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Attribute{" + "attribute=" + attribute + ", value=" + value + '}';
    }

}
