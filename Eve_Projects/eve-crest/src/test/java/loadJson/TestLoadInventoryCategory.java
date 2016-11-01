package loadJson;

import com.algerd.eve.crest.LoadJson;
import com.algerd.eve.crest.jsonEntity.InventoryCategory;

public class TestLoadInventoryCategory {

    public static void main(String[] args) {
       
        String urlString = "https://crest-tq.eveonline.com/inventory/categories/3/";      
        LoadJson<InventoryCategory> loadJson = new LoadJson<>();
        InventoryCategory inventoryCategory = loadJson.convertJsonToObject(urlString, InventoryCategory.class);
      
        System.out.println(loadJson.convertObjectToJsonString(inventoryCategory));     
    }
    
}
