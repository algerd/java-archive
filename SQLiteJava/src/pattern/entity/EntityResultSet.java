
package pattern.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface EntityResultSet {

    Entity fill(ResultSet rs) throws SQLException ;
}
