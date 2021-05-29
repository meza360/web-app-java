
package ModeloServicio;

import java.util.List;

public interface CRUD {
    public List listar();
    public Medicamento listarCodigo (int Codigo);
    public String add(String Medicamento, String Dosis, double Precio_unitario, int Cantidad_existencia, String Laboratorio_farmaceutico, String Vencimiento, String Presentacion );
    public String edit(int Codigo, String Medicamento, String Dosis, double Precio_unitario, int Cantidad_existencia, String Laboratorio_farmaceutico, String Vencimiento, String Presentacion );
    public Medicamento delete (int Codigo);
    public Medicamento listarLaboratorios(String Laboratorio_farmaceutico);
    
}
