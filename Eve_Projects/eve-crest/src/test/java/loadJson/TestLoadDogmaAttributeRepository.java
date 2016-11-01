package loadJson;

import com.algerd.eve.crest.LoadJson;
import com.algerd.eve.crest.repository.DogmaAttributeRepository;

public class TestLoadDogmaAttributeRepository {

    public static void main(String[] args) {
        DogmaAttributeRepository repository = new DogmaAttributeRepository();    
         
        System.out.println(new LoadJson().convertObjectToJsonString(repository.getRepository()));    			
    }
}
