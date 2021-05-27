
package modelo;

//import Datos.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexion {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
        String connectionUrl =
                "jdbc:sqlserver://DESKTOP-76OVA2V\\SQLEXPRESS:1433;"
                        + "database=Farmacia;"
                        + "user=sa;"
                        + "password=123;";
                        

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            // Code here.
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}