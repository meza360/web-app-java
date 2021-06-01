

/**
 *
 * @author Marvin Alonso Lemen Sanchez 090-17-99
 * @author GIOVANI DAVID MEZA POGGIO 5990-18-14676
 * @author Wendy Pricila Cifuentes Lutin 5990-18-4413
 * @author Byron Rosbin Antonio Orozco 9941-19-23685
 * @author Karina Aracely Sanchez Ixcot 9941-19-264
 */

package ModeloServicio;

import java.util.List;

public interface CRUD {
    public List listar();
    public Medicamento listarCodigo (int Codigo);
    public String add(String Medicamento, String Dosis, double Precio_unitario, int Cantidad_existencia, String Laboratorio_farmaceutico, String Vencimiento, String Presentacion );
    public String edit(int Codigo, String Medicamento, String Dosis, double Precio_unitario, int Cantidad_existencia, String Laboratorio_farmaceutico, String Vencimiento, String Presentacion );
    public Medicamento delete (int Codigo);
    public List listarLaboratorios(String Laboratorio_farmaceutico);
    public List listarNombre(String nombre_medicamento);
    
}
