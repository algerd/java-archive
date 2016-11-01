
package com.algerd.eve.crest.repository;

import com.algerd.eve.crest.jsonEntity.DogmaAttribute;

public class DogmaAttributeRepository extends BaseRepository<DogmaAttribute> {
    
    public DogmaAttributeRepository() {
        super();       
        setUrlString("https://crest-tq.eveonline.com/dogma/attributes/");
        create();
    }
    
}
