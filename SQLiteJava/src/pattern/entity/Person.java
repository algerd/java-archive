
package pattern.entity;

import java.util.HashMap;
import pattern.table.PersonTable.PersonColumn;

public class Person extends Entity {
    
    private int id = -1;
    private String first_name;
    private String last_name;       
    private String gender;
    private String dob;
    private double income;
    
    public Person() {   
    }
    
    public Person(String first_name, String last_name, String gender, String dob, double income) {   
        this.first_name = first_name;
        this.last_name = last_name;        
        this.gender = gender;        
        this.dob = dob;
        this.income = income;
    }
    
    public HashMap<String, String> getEntintyMap() {
        HashMap<String, String> entityMap = new HashMap<>();
        entityMap.put(PersonColumn.ID.toString(), "" + getId());
        entityMap.put(PersonColumn.FIRST_NAME.toString(), "'" + getFirst_name() + "'");
        entityMap.put(PersonColumn.LAST_NAME.toString(), "'" + getLast_name() + "'");
        entityMap.put(PersonColumn.GENDER.toString(), "'" + getGender() + "'");
        entityMap.put(PersonColumn.DOB.toString(), "'" + getDob() + "'");
        entityMap.put(PersonColumn.INCOME.toString(), "" + getIncome());                
        return entityMap;                                 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "id:" + id +
               ", first_name:" + first_name +
               ", last_name:" + last_name +
               ", gender:" + gender + 
               ", dob:" + dob +
               ", incime:" + income;
    }
     
}
