
package pattern.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import pattern.table.PersonTable;

public class PersonResultSet implements EntityResultSet {
    
    @Override
    public Person fill(ResultSet rs) throws SQLException {
        Person person = null;
        while (rs.next()) {
            person = new Person();
            person.setId(rs.getInt(PersonTable.PersonColumn.ID.toString()));
            person.setFirst_name(rs.getString(PersonTable.PersonColumn.FIRST_NAME.toString()));
            person.setLast_name(rs.getString(PersonTable.PersonColumn.LAST_NAME.toString()));
            person.setGender(rs.getString(PersonTable.PersonColumn.GENDER.toString()));
            person.setDob(rs.getString(PersonTable.PersonColumn.DOB.toString()));
            person.setIncome(rs.getDouble(PersonTable.PersonColumn.INCOME.toString()));
        }
        //System.out.println(person);
        return person;
    }

}
