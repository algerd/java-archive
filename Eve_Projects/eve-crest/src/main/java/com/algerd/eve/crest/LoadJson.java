
package com.algerd.eve.crest;

import com.algerd.eve.crest.jsonEntity.Page;
import com.algerd.eve.crest.jsonEntity.jsonProperty.Item;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LoadJson<T> {
    
    private ObjectMapper mapper = new ObjectMapper();
         
    // Convert JSON string from file to Object
    public T convertJsonToObject(String urlString, Class<T> cls) {        
        try {
			return mapper.readValue(new URL(urlString), cls);			
		} catch (JsonGenerationException | JsonMappingException  e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return null;
    }
       
    public static List<Item> convertJsonToItems(String urlString) {        
        ObjectMapper mapper = new ObjectMapper();  
        List<Item> items = new ArrayList<>(); 
        try {                  
            while (true) {               
                Page page = mapper.readValue(new URL(urlString), Page.class);
                items.addAll(page.getItems());            
                if (page.hasNext()) {
                    urlString = page.getNext().getHref();
                } else break;
            }            
		} catch (JsonGenerationException | JsonMappingException  e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return items;
    }
    
    // for debug
    public String convertObjectToJsonString(Object obj) {       
        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }
    

}
