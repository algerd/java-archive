
package com.algerd.eve.crest.repository;

import com.algerd.eve.crest.LoadJson;
import com.algerd.eve.crest.jsonEntity.jsonProperty.Item;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseRepository<T> implements CrudRepository<T> {
    
    protected String urlString;
    protected final List<T> repository = new ArrayList<>();
    protected final Class<T> entityClass;
  
    @SuppressWarnings("unchecked")
    public BaseRepository() {
        Type genericSuperclass = this.getClass().getGenericSuperclass();
        while (!(genericSuperclass instanceof ParameterizedType)) {
            if (!(genericSuperclass instanceof Class)) {
                throw new IllegalStateException("Unable to determine type "
                    + "arguments because generic superclass neither "
                    + "parameterized type nor class.");
            }
            if (genericSuperclass == BaseRepository.class) {
                throw new IllegalStateException("Unable to determine type "
                    + "arguments because no parameterized generic superclass found.");
            }
            genericSuperclass = ((Class) genericSuperclass).getGenericSuperclass();
        }
        Type[] arguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        entityClass = (Class<T>) arguments[0];
    }
       
    @Override
    public void create() {
        repository.clear();
        LoadJson<T> loadJson = new LoadJson<>();
        List<Item> items = LoadJson.convertJsonToItems(urlString);
        
        //System.out.println(loadJson.convertObjectToJsonString(items));
         
        /*
        items.stream().forEach(e -> {                                            
            repository.add(loadJson.convertJsonToObject(e.getHref(), entityClass));                                           
        });
        */
        // тест загрузки 100 сущностей - долго(при 2000 будет очень долго). Надо разбивать на потоки.
        int i = 0;
        for (Item item : items) {
            repository.add(loadJson.convertJsonToObject(item.getHref(), entityClass)); 
            i++;
            if (i > 100) break;
        }
        
    }
    
    @Override
    public List<T> getRepository() {
        return repository;
    }

    public String getUrlString() {
        return urlString;
    }

    public void setUrlString(String urlString) {
        this.urlString = urlString;
    }   
    
}
