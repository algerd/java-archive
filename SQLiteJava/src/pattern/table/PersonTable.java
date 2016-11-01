
package pattern.table;

import java.util.HashMap;
import pattern.driver.DCL;
import pattern.entity.Person;
import pattern.entity.PersonResultSet;

public class PersonTable extends Table<Person> {
    
    public static final String TABLE_NAME = "person";
    
    public enum PersonColumn {
        ID("id"),
        FIRST_NAME("first_name"),
        LAST_NAME("last_name"),
        GENDER("gender"),
        DOB("dob"),
        INCOME("income");
        
        private final String column;
        
        private PersonColumn(String column) {
            this.column = column;
        }

        public String getColumn() {
            return column;
        }

        @Override
        public String toString() {
            return getColumn();
        }     
    }
       
    @Override
    public void save(Person entity) {
        HashMap<String, String> entityMap =  entity.getEntintyMap();
        // если сущность ещё не имеет id - добавлять в бд с автоинкрементацией id
        if (entity.getId() == -1) {
            entityMap.remove(PersonColumn.ID.getColumn());
            int id = DCL.insert(TABLE_NAME, entityMap);
            entity.setId(id);
        }
        else {
            DCL.update(TABLE_NAME, entityMap);
        }            
    }
    
    @Override
    public void delete(Person entity) {
        int id = entity.getId();
        if (id > 0) {
            DCL.delete(TABLE_NAME, id);
        }
        //TODO: удалять entity из таблиц gui и потом entity = null;
    }
    
    // выбрать entity c id
    @Override
    public Person select(int id) {
        return (Person)DCL.select(TABLE_NAME, id, new PersonResultSet());
        //TODO: добавлять выбранные элементы в set сущностей таблицы?
    }
    
    /*
    // выбрать все сущности
    public Set<Person> select() {        
    }
     
    // выбрать сущности согласно условию where expression
    public Set<Person> selectAll(String expression) {    
    }
    */
}
