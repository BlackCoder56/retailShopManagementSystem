
package database;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
//import java.sql.
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
