
package com.algerd.eve.crest.jsonEntity.jsonProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * json-property : href
 * @author Alex
 */
public class Href {
    
    @JsonProperty("href") private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "Href{" + "href=" + href + '}';
    }
    
}
