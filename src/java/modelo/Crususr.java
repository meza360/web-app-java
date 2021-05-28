
package modelo;


import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    conexion conex;
    int res;
    String msj;
    
    
    
    @Override
    public List listar() {
        List <User>  datos=new ArrayList<>();
        String sql= "SELECT * FROM Medicamentos";
        try {
            conex = new conexion("progra","programacion3");
            con = conex.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                User u=new User();
                u.setCodigo(rs.getInt("Codigo"));
                u.setMedicamento(rs.getString("Medicamento"));
                u.setDosis(rs.getString("Dosis"));
                u.setPrecio_unitario(rs.getDouble("Precio_unitario"));
                u.setCantidad_existencia(rs.getInt("Cantidad_existencia"));
                u.setLaboratorio_farmaceutico(rs.getString("Laboratorio_farmaceutico"));
                u.setVencimiento(rs.getString("Vencimiento"));
                u.setPresentacion(rs.getString("Presentacion"));
                
                datos.add(u);
            }
            
        }catch (Exception error){
            System.out.println("Error en la obtencion de datos: " + error);
            error.printStackTrace();
        }
        return datos;
    }

    @Override
    public User listarCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add(String Medic, String Dos, double Precio, int Cantidad, String Lab, String Ven, String Pres) {
        String sql="insert into Medicamentos(Medicamento, Dosis, Precio_unitario, Cantidad_existencia, Laboratorio_farmaceutico, Vencimiento(?,?,?,?,?,?)";
        try {
            con = conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, Medic);
            ps.setString(2, Dos);
            ps.setDouble(3, Precio);
            ps.setInt(4, Cantidad);
            ps.setString(5, Lab);
            ps.setString(6, Ven);
            ps.setString(7, Pres);
            res=ps.executeUpdate();
            if(res==1){
                msj="Medicamento agregado";
            }else{
                msj="Error";
            }
            
        }catch (SQLException e){
        }
        return msj;
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
