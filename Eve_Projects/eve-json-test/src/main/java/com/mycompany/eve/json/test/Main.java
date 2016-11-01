
package com.mycompany.eve.json.test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        ObjectMapper mapper = new ObjectMapper();
        
        try {
			// Convert JSON string from file to Object
			InventoryType inventoryType = mapper.readValue(new URL("https://crest-tq.eveonline.com/inventory/types/2/"), InventoryType.class);
			
            System.out.println(inventoryType);
            // from Object to json
			String inventoryTypeString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(inventoryType);
			System.out.println(inventoryTypeString);
            
            List<InventoryTypes> inventoryTypesList = new ArrayList<>(); 
            String urlString = "https://crest-tq.eveonline.com/inventory/types/";
            while (true) {               
                InventoryTypes inventoryTypes = mapper.readValue(new URL(urlString), InventoryTypes.class);
                
                System.out.println(inventoryTypes);
                // from Object to json
                String inventoryTypesString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(inventoryTypes);
                System.out.println(inventoryTypesString);
                
                inventoryTypesList.add(inventoryTypes); 
                if (inventoryTypes.getNext() != null) {
                    urlString = inventoryTypes.getNext().getHref();
                } else break;
            }

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
}
