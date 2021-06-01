/**
 *
 * @author Marvin Alonso Lemen Sanchez 090-17-99
 * @author GIOVANI DAVID MEZA POGGIO 5990-18-14676
 * @author Wendy Pricila Cifuentes Lutin 5990-18-4413
 * @author Byron Rosbin Antonio Orozco 9941-19-23685
 * @author Karina Aracely Sanchez Ixcot 9941-19-264
 */


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
    
