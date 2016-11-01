
package pattern.test;

import pattern.entity.Person;
import pattern.table.PersonTable;

public class TestSelectPerson {
    public static void main(String[] args) {
        PersonTable personTable = new PersonTable();
        
        // создать и сохранить новую сущность
        Person person1 = new Person("Kate", "Sims", "F", "1975-01-01", 100);       
        personTable.save(person1);
        
        //выбрать сущность из бд по её id
        int id = person1.getId();
        Person person2 = personTable.select(id);
        System.out.println(person2.toString());
    }

}
