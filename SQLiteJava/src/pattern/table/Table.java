package pattern.table;

import pattern.entity.Entity;

public abstract class Table<T extends Entity> {
    
    public abstract void save(T entity);
    
    public abstract void delete(T entity);
    
    public abstract T select(int id);
}
