
package pattern.test;

import pattern.entity.Person;
import pattern.table.PersonTable;

public class TestSavePerson {
    public static void main(String[] args) {
        // создать и сохранить новую сущность
        Person person1 = new Person("Kate", "Sims", "F", "1975-01-01", 100);       
        new PersonTable().save(person1);
        
        // изменить и сохранить сущность
        person1.setFirst_name("Alex");
        new PersonTable().save(person1);
        
    }

}
