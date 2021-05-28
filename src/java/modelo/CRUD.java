
package modelo;

import java.util.List;

public interface CRUD {
    public List listar();
    public User listarCodigo (int Codigo);
    public String add(String Medicamento, String Dosis, double Precio_unitario, int Cantidad_existencia, String Laboratorio_farmaceutico, String Vencimiento, String Presentacion );
    public String edit(int Codigo, String Medicamento, String Dosis, double Precio_unitario, int Cantidad_existencia, String Laboratorio_farmaceutico, String Vencimiento, String Presentacion );
    public User delete (int Codigo);
    
}
