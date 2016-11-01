
package com.algerd.eve.crest.jsonEntity;

import com.algerd.eve.crest.jsonEntity.jsonProperty.Item;
import com.algerd.eve.crest.jsonEntity.jsonProperty.Href;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


/**
 * All json-object collections.
 * https://crest-tq.eveonline.com/dogma/attributes
 * https://crest-tq.eveonline.com/inventory/types
 * https://crest-tq.eveonline.com/inventory/groups
 * https://crest-tq.eveonline.com/inventory/categories
 * @author Alex
 */
@JsonIgnoreProperties({ "totalCount_str", "pageCount_str" })
public class Page {
    
    @JsonProperty("totalCount") private int totalCount;  
    @JsonProperty("pageCount") private int pageCount; 
    @JsonProperty("next") private Href next; 
    @JsonProperty("previous") private Href previous;  
    @JsonProperty("items") private List<Item> items;
    
    public boolean hasNext() {
        return next != null;
    }
  
    public int getTotalCount() {
        return totalCount;
    }  
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
  
    public int getPageCount() {
        return pageCount;
    }     
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
       
    public Href getNext() {
        return next;
    }
    public void setNext(Href next) {
        this.next = next;
    }
   
    public Href getPrevious() {
        return previous;
    }
    public void setPrevious(Href previous) {
        this.previous = previous;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
  
}
