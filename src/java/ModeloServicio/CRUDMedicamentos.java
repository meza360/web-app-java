
package ModeloServicio;


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
public class CRUDMedicamentos implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex;
    int res;
    String msj;
    Medicamento medicamento = new Medicamento();
    
    
    @Override
    public List listar() {
        
        List <Medicamento>  datos=new ArrayList<>();
        String sql= "SELECT * FROM Medicamentos";
        try {
            conex = new Conexion("progra","programacion3");
            con = conex.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Medicamento u = new Medicamento();
                
                u.setCodigo(rs.getInt(1));
                u.setMedicamento(rs.getString(2));
                u.setDosis(rs.getString(3));
                u.setPrecio_unitario(rs.getDouble(4));
                u.setCantidad_existencia(rs.getInt(5));
                u.setLaboratorio_farmaceutico(rs.getString(6));
                u.setVencimiento(rs.getString(7));
                u.setPresentacion(rs.getString(8));
                
                
                datos.add(u);
            }
            
        }catch (SQLException error){
            System.out.println("Error en la obtencion de datos: " + error);
            error.printStackTrace();
        }
        return datos;
    }

    @Override
    public Medicamento listarCodigo(int Codigo) {
        String sql="select *from Medicamentos where Codigo="+Codigo;
       
        try {
            conex = new Conexion("progra","programacion3");
            con = conex.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
                medicamento.setCodigo(rs.getInt(1));
                medicamento.setMedicamento(rs.getString(2));
                medicamento.setDosis(rs.getString(3));
                medicamento.setPrecio_unitario(rs.getDouble(4));
                medicamento.setCantidad_existencia(rs.getInt(5));
                medicamento.setLaboratorio_farmaceutico(rs.getString(6));
                medicamento.setVencimiento(rs.getString(7));
                medicamento.setPresentacion(rs.getString(8));
                
                
                
            }
            
        }catch (SQLException error){   
        }
        return medicamento;
    }

    @Override
    public String add(String Medicamento, String Dosis, double Precio_unitario, int Cantidad_existencia, String Laboratorio_farmaceutico, String Vencimiento, String Presentacion) {
        String sql="insert into Medicamentos(Medicamento, Dosis, Precio_unitario, Cantidad_existencia, Laboratorio_farmaceutico, Vencimiento, Presentacion) values (?,?,?,?,?,?,?)";
        try {
            conex = new Conexion("progra","programacion3");
            con = conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, Medicamento);
            ps.setString(2, Dosis);
            ps.setDouble(3, Precio_unitario);
            ps.setInt(4, Cantidad_existencia);
            ps.setString(5, Laboratorio_farmaceutico);
            ps.setString(6, Vencimiento);
            ps.setString(7, Presentacion);
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
    public String edit(int Codigo, String Medicamento, String Dosis, double Precio_unitario, int Cantidad_existencia, String Laboratorio_farmaceutico, String Vencimiento, String Presentacion) {
        String sql="update Medicamentos set Medicamento=?, Dosis=?,Precio_unitario=?, Cantidad_existencia=?,Laboratorio_farmaceutico=?,Vencimiento=?,Presentacion=? where Codigo= "+Codigo;
        try {
            conex = new Conexion("progra","programacion3");
            con = conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, Medicamento);
            ps.setString(2, Dosis);
            ps.setDouble(3, Precio_unitario);
            ps.setInt(4, Cantidad_existencia);
            ps.setString(5, Laboratorio_farmaceutico);
            ps.setString(6, Vencimiento);
            ps.setString(7, Presentacion);
            res=ps.executeUpdate();
            if(res==1){
                msj="Medicamento actualizado";
            }else{
                msj="Error";
            }
            
        }catch (SQLException e){
        }
        return msj;
    }

    @Override
    public Medicamento delete(int Codigo) {
        String sql ="delete from Medicamentos where Codigo="+Codigo;
        try{
            conex = new Conexion("progra","programacion3");
            con = conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e){
    }
      return medicamento;  
    }

    @Override
    public Medicamento listarLaboratorios(String Laboratorio_farmaceutico) {
      
        String sql="SELECT * FROM Medicamentos WHERE Laboratorio_farmaceutico LIKE '"+ Laboratorio_farmaceutico+ "%';";
        Medicamento medicamento = new Medicamento();
        try {
            conex = new Conexion("progra","programacion3");
            con = conex.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
                medicamento.setCodigo(rs.getInt(1));
                medicamento.setMedicamento(rs.getString(2));
                medicamento.setDosis(rs.getString(3));
                medicamento.setPrecio_unitario(rs.getDouble(4));
                medicamento.setCantidad_existencia(rs.getInt(5));
                medicamento.setLaboratorio_farmaceutico(rs.getString(6));
                medicamento.setVencimiento(rs.getString(7));
                medicamento.setPresentacion(rs.getString(8));
                
                
                
            }
            
        }catch (SQLException error){   
        }
        return medicamento;
    }
    
    
}
