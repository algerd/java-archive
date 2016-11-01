
package  pattern.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pattern.entity.Entity;
import pattern.entity.EntityResultSet;

public class Connect {
    
	public static Connection getConnection() throws SQLException {	
		DriverManager.registerDriver(new org.sqlite.JDBC());        
        String urlDb = "jdbc:sqlite:src//resources//db//persontest.sqlite"; 
		Connection conn = DriverManager.getConnection(urlDb);
		conn.setAutoCommit(false);
		return conn;
	}
      
    public static void executeUpdate(String SQL) {
        Connection conn = null;
        try {                        
            conn = getConnection();
			conn.createStatement().executeUpdate(SQL);                     
            commit(conn);
        }
        catch (SQLException e) {
			e.printStackTrace();
			rollback(conn);			
		}
		finally {
			closeConnection(conn);
		} 
    }
    
    // возвращает последний ключ вставленного id
    public static int executeInsert(String SQL) {
        int lastId = 0;
        Connection conn = null;
		try {
            conn = Connect.getConnection();          
            conn.createStatement().executeUpdate(SQL);       
            lastId = getGeneratedKey(conn);
            commit(conn);
        }    
        catch (SQLException e) {
			e.printStackTrace();
			rollback(conn);			
		}
		finally {
			closeConnection(conn);
		}
        return lastId;  
    }
    
    public static Entity executeSelect(String SQL, EntityResultSet ers) {
        Connection conn = null;
        Entity entity = null;
        try {                        
            conn = getConnection();
			ResultSet rs = conn.createStatement().executeQuery(SQL);
            entity = ers.fill(rs);        
            commit(conn);
        }
        catch (SQLException e) {
			e.printStackTrace();
			rollback(conn);			
		}
		finally {
			closeConnection(conn);
		}
        return entity;
    }
     
    // получить последний сгенерированный первичный ключ 
    public static int getGeneratedKey(Connection conn) throws SQLException {     
        Statement stmt = conn.createStatement();                                  
        ResultSet rs = stmt.executeQuery("select last_insert_rowid();");         
        return (rs.next()) ? rs.getInt(1) : 0;
    }
    
	public static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeStatement(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeResultSet(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void commit(Connection conn) {
		try {
			if (conn != null) {
				conn.commit();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void rollback(Connection conn) {
		try {
			if (conn != null) {
				conn.rollback();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
