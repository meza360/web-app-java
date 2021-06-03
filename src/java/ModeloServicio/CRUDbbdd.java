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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CRUDbbdd implements CRUDBD{

    
    
    
    public CRUDbbdd(){}
    
    
    PreparedStatement ps;
    Connection con;
    Conexion conex;
    
    
    
    @Override
    public int insertarArchivo(String rutaArchivo) {
        
        int opStatus = 0;
        
        String query = "BULK INSERT Medicamentos\n" +
    "    FROM '" + rutaArchivo + "'\n" +
    "    WITH\n" +
    "    (\n" +
    "    FIRSTROW = 2,\n" +
    "    FIELDTERMINATOR = ',',  --CSV field delimiter\n" +
    "    ROWTERMINATOR = '\\n',   --Use to shift the control to next row\n" +
    "    ERRORFILE = '" + rutaArchivo + ".csv',\n" +
    "    TABLOCK\n" +
    "    )";
        
        
        try {
            conex = new Conexion("progra","programacion3");
            con = conex.getConnection();
            ps=con.prepareStatement(query);
            ps.execute();
            if (ps != null) {
                System.out.println("El resultado de la insercion de datos ha sido exitoso");
                opStatus = 1;
                
            }
            
        } catch (Exception error) {
            opStatus = 0;
            System.out.println("Error en la insercion del archivo! " + error);
            error.printStackTrace();
        }
        
        return opStatus;
    }

    @Override
    public int ventaActualizar(int Codigo, int Cantidad) {
        
        int opStatus = 0;
        String query = "EXEC sp_venta_actualizacion " + Codigo + "," + Cantidad + ";";
        
        try {
            conex = new Conexion("progra","programacion3");
            con = conex.getConnection();
            ps=con.prepareStatement(query);
            ps.execute();
            if (ps != null) {
                System.out.println("El resultado de la VENTA de datos ha sido exitoso");
                opStatus = 1;
                
            }
            
        } catch (Exception error) {
            opStatus = 0;
            System.out.println("Error en la Venta de productos! " + error);
            error.printStackTrace();
        }
        
        return opStatus;
    }
    
}
