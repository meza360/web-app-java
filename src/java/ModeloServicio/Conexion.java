
package ModeloServicio;

//import Datos.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    
    String url,user,pass;
    Connection con;
    
    public Conexion(){}
    
    
    public Conexion(String user, String password){
        this.user = user;
        this.pass = password;
        url = "jdbc:sqlserver://localhost:1433;database=Farmacia;";
        try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             con = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception error) {
            System.out.println("Error en la conexion con la base de datos: " + error);
            error.printStackTrace();
        }
       
    }
    
    public Connection getConnection(){
       return con;
    }
}
    
