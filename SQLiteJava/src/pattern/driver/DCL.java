
package pattern.driver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import pattern.entity.Entity;
import pattern.entity.EntityResultSet;

public class DCL {
       
    public static int insert(String tableName,  HashMap<String, String> entityMap) {  
        String fields = "";
        String values = ""; 
        // Get the entry Set 
        Set<Map.Entry<String, String>> entrySet = entityMap.entrySet();
        Iterator<Map.Entry<String, String>> entrySetIterator = entrySet.iterator();
        while (entrySetIterator.hasNext()) {          
            Map.Entry<String, String> entry = entrySetIterator.next();            
            fields += entry.getKey();
            values += entry.getValue();            
            if (entrySetIterator.hasNext()) {
                fields += ",";
                values += ",";
            }
        }       
        String SQL = "insert into " + tableName + "(" + fields + ") values" + "(" + values + ")";
        System.out.println(SQL);             
        return Connect.executeInsert(SQL);     
    }
        
    public static void update(String tableName,  HashMap<String, String> entityMap) {              
        String set = "";       
        // Get the entry Set 
        Set<Map.Entry<String, String>> entrySet = entityMap.entrySet();
        Iterator<Map.Entry<String, String>> entrySetIterator = entrySet.iterator();
        while (entrySetIterator.hasNext()) {          
            Map.Entry<String, String> entry = entrySetIterator.next();           
            set += entry.getKey() + "=" + entry.getValue();                 
            if (entrySetIterator.hasNext()) {            
                set += ",";
            }
        }
        if (set.equals("")) {
            return;
        }     
        String SQL = "update " + tableName + " set " + set + " where id = " + entityMap.get("id");       
        System.out.println(SQL);      
        Connect.executeUpdate(SQL);           
    } 
    
    public static void delete(String tableName,  int id) {     
        String SQL = "delete from " + tableName + " where id = " + id;
        Connect.executeUpdate(SQL);
    }
    
    public static Entity select(String tableName,  int id, EntityResultSet ers) {        
        String SQL = "select * from " + tableName + " where id = " + id;
        //System.out.println(SQL);      
        return Connect.executeSelect(SQL, ers);
    }
    
}
