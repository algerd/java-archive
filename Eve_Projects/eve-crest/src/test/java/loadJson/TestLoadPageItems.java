package loadJson;

import com.algerd.eve.crest.jsonEntity.jsonProperty.Item;
import com.algerd.eve.crest.LoadJson;
import java.util.List;

public class TestLoadPageItems {

    public static void main(String[] args) {             
        //String urlString = "https://crest-tq.eveonline.com/dogma/attributes/";
        //String urlString = "https://crest-tq.eveonline.com/inventory/types/";
        //String urlString = "https://crest-tq.eveonline.com/inventory/groups/";
        String urlString = "https://crest-tq.eveonline.com/inventory/categories/";
             
        List<Item> items = LoadJson.convertJsonToItems(urlString);
        
        System.out.println(new LoadJson().convertObjectToJsonString(items));            
    }
}
