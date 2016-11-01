
package sqlitejava.rowset;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.RowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

/*
setConnectionParameters() method loads a JDBC driver and sets its connection parameters. 
getRowSetFactory() method returns a RowSetFactory instance. 
printPersonRecord() method prints records from a RowSet.
*/
public class RowSetUtil {
	private static boolean driverLoaded = false;

	public static void setConnectionParameters(RowSet rs) throws SQLException {
		if (!driverLoaded) {
			Driver derbyEmbeddedDriver = new org.sqlite.JDBC();
			DriverManager.registerDriver(derbyEmbeddedDriver);
			driverLoaded = true;
		}
		// Set the rowset database connection properties
		String dbURL = "jdbc:sqlite:src//resources//db//persontest.sqlite";
		String userId = "";
		String password = "";		
		rs.setUrl(dbURL);
		rs.setUsername(userId);
		rs.setPassword(password);        
	}
	
	public static RowSetFactory getRowSetFactory() {
		try {
			RowSetFactory factory = RowSetProvider.newFactory();
			return factory;
		} 
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Print person id and name for each person record
	public static void printPersonRecord(RowSet rs) throws SQLException {
		while (rs.next()) {
			int personId = rs.getInt("id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			System.out.println("Row #" + rs.getRow() + ":" + 
			                   " Person ID:" + personId + 
			                   ", First Name:" + firstName + 
			                   ", Last Name:" + lastName);
		}
		System.out.println();
	}
}
