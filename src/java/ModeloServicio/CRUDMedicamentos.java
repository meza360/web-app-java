/*
 * Copyright (C) 2021 
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

/**
 *
 * @author Marvin Alonso Lemen Sanchez 090-17-99
 * @author GIOVANI DAVID MEZA POGGIO 5990-18-14676
 * @author Wendy Pricila Cifuentes Lutin 5990-18-4413
 * @author Byron Rosbin Antonio Orozco 9941-19-23685
 * @author Karina Aracely Sanchez Ixcot 9941-19-264
 */


package ModeloServicio;


import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




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
        
        List <Medicamento> datos = new ArrayList<>();
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
            System.out.println("Error en la obtencion de datos: " + error);
            error.printStackTrace();
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
            
        }catch (SQLException error){
            System.out.println("Error en la obtencion de datos: " + error);
            error.printStackTrace();
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
            
        }catch (SQLException error){
            System.out.println("Error en la obtencion de datos: " + error);
            error.printStackTrace();
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
    public List listarLaboratorios(String Laboratorio_farmaceutico) {
        List<Medicamento> listaMedicamentos = new ArrayList<>();
        String sql="SELECT * FROM Medicamentos WHERE Laboratorio_farmaceutico LIKE '"+ Laboratorio_farmaceutico+ "%';";
        
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
                
                listaMedicamentos.add(u);    
            }
            
        }catch (SQLException error){  
            System.out.println("Error en la obtencion de datos: " + error);
            error.printStackTrace();
        }
        return listaMedicamentos;
    }

    @Override
    public List listarNombre(String nombre_medicamento) {
        List<Medicamento> listaMedicamentos = new ArrayList<>();
        String sql="SELECT * FROM Medicamentos WHERE Medicamento LIKE '"+ nombre_medicamento + "%';";
        
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
                
                listaMedicamentos.add(u);  
            }
            
        }catch (SQLException error){  
            System.out.println("Error en la obtencion de datos: " + error);
            error.printStackTrace();
        }
        return listaMedicamentos;
    }
    
    
}
