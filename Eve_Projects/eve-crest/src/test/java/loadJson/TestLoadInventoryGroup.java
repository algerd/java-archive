package loadJson;

import com.algerd.eve.crest.LoadJson;
import com.algerd.eve.crest.jsonEntity.InventoryGroup;

public class TestLoadInventoryGroup {

    public static void main(String[] args) {
       
        String urlString = "https://crest-tq.eveonline.com/inventory/groups/1283/";      
        LoadJson<InventoryGroup> loadJson = new LoadJson<>();
        InventoryGroup inventoryGroup = loadJson.convertJsonToObject(urlString, InventoryGroup.class);
      
        System.out.println(loadJson.convertObjectToJsonString(inventoryGroup));     
    }
    
}
