
package modelo;

import Datos.Usuario;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Marvin Lemen
 */
public class Crususr implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    conexion conex= new conexion();
    
    @Override
    public List listar() {
        List <Usuario>  datos=new ArrayList<>();
        String sql= "select * from Codigo";
        try {
            con = conex.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuario u=new Usuario();
                u.setCodigo(rs.getInt("Codigo"));
                u.setFname(rs.getString("fname"));
                u.setLname(rs.getString("lname"));
                datos.add(u);
            }
            
        }catch (Exception e){
        }
        return datos;
    }

    @Override
    public Usuario listarCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add(String medicamento, String dosis, double precio_unitario, int cantidad_existencia, String laboratorio_farmaceutico, String vencimiento, String presentacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String edit(int codigo, String medicamento, String dosis, double precio_unitario, int cantidad_existencia, String laboratorio_farmaceutico, String vencimiento, String presentacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario delete(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
