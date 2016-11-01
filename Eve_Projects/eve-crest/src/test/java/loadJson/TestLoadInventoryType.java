package loadJson;

import com.algerd.eve.crest.jsonEntity.InventoryType;
import com.algerd.eve.crest.LoadJson;

public class TestLoadInventoryType {

    public static void main(String[] args) {
       
        String urlString = "https://crest-tq.eveonline.com/inventory/types/2040/";      
        LoadJson<InventoryType> loadJson = new LoadJson<>();
        InventoryType inventoryTypeJson = loadJson.convertJsonToObject(urlString, InventoryType.class);
             
        System.out.println(new LoadJson<InventoryType>().convertObjectToJsonString(inventoryTypeJson));     
    }
    
}
