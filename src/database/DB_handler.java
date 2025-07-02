
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author elisha
 */
public class DB_handler {
    public static Connection getConnection(){
        try {
            Class.forName("");
            return DriverManager.getConnection("");
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }
}
