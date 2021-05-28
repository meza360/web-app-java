
package modelo;


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
        List <User>  datos=new ArrayList<>();
        String sql= "SELECT * FROM Medicamentos";
        try {
            con = conex.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                User u=new User();
                u.setCodigo(rs.getInt("Codigo"));
                u.setMedicamento(rs.getString("Medicamento"));
                u.setDosis(rs.getString("Dosis"));
                u.setPrecio_unitario(rs.getString("Precio_unitario"));
                u.setCantidad_existencia(rs.getInt("Cantidad_existencia"));
                u.setLaboratorio_farmaceutico(rs.getString("Laboratorio_farmaceutico"));
                u.setVencimiento(rs.getString("Vencimiento"));
                u.setPresentacion(rs.getString("Presentacion"));
                datos.add(u);
            }
            
        }catch (Exception e){
        }
        return datos;
    }

    @Override
    public User listarCodigo(int codigo) {
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
    public User delete(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
