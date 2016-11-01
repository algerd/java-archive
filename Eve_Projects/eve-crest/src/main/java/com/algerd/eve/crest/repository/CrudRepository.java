
package com.algerd.eve.crest.repository;

import java.util.List;

public interface CrudRepository<T> {

    List<T> getRepository();
    
    void create();
}
