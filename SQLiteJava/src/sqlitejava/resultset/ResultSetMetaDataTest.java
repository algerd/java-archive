
package  sqlitejava.resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import sqlitejava.base.Connect;

/*
An
object of the ResultSetMetaData interface represents the result set metadata. You can get a ResultSetMetaData
object by calling the getMetaData() method of the ResultSet interface.

A ResultSetMetaData contains a lot of information about all columns in a result set. All of the methods, except
getColumnCount(), in the ResultSetMetaData interface accept a column index in the result set as an argument.
It contains the table name, name, label, database data type, class name in Java, nullability, precision, etc. of a column.
It also contains the column count in the result set. Its getTableName() method returns the table name of a column;
the getColumnName() method returns the column’s name; the getColumnLabel() method returns the column’s label;
the getColumnTypeName() method returns the column type in database; and the getColumnClassName() method
returns Java class used to represent the data for the column. Its getColumnCount() method returns the number of
columns in the result set.

If you have to write generic code to process any or an unknown result set, you will find a ResultSetMetaData
object indispensable. For example, suppose you want to develop a Swing application that will let the user enter
in a query and you will display the query data in a JTable. To construct the JTable, you must know the number
of columns in the result set. You can use the getColumnCount() method of a ResultSetMetaData object to know
the number of columns in a result set.
*/
public class ResultSetMetaDataTest {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = Connect.getConnection();
			String SQL = "select id as \"Person ID\", " + 
			             "first_name as \"First Name\", " + 
			             "gender as Gender, " + 
			             "dob as \"Birth Date\", " + 
			             "income as Income " + 
			             "from person";

			// Print the reSult set matadata
			printMetaData(conn, SQL);
			
			Connect.commit(conn);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			Connect.rollback(conn);
		}
		finally {
			Connect.closeConnection(conn);
		}
	}
	public static void printMetaData(Connection conn, String SQL) 
			throws SQLException {
		Statement stmt = conn.createStatement();
		try {
			ResultSet rs = stmt.executeQuery(SQL);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			System.out.println("Column Count:" + columnCount);

			for (int i = 1; i <= columnCount; i++) {
				System.out.println("Index:" + i +
					", Name:" + rsmd.getColumnName(i) +
					", Label:" + rsmd.getColumnLabel(i) +
					", Type Name:" + rsmd.getColumnTypeName(i) + 
					", Class Name:" + rsmd.getColumnClassName(i));
			}
		}
		finally {
			Connect.closeStatement(stmt);
		}
	}
}
