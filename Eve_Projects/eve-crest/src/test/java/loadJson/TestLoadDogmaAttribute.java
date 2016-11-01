package loadJson;

import com.algerd.eve.crest.LoadJson;
import com.algerd.eve.crest.jsonEntity.DogmaAttribute;

public class TestLoadDogmaAttribute {

    public static void main(String[] args) {
              
        String urlString = "https://crest-tq.eveonline.com/dogma/attributes/4/";
        LoadJson<DogmaAttribute> loadJson = new LoadJson<>();
        DogmaAttribute dogmaAttribute = loadJson.convertJsonToObject(urlString, DogmaAttribute.class);
               
        System.out.println(loadJson.convertObjectToJsonString(dogmaAttribute));    			
    }
}
