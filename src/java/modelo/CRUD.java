
package modelo;
import Datos.Usuario;
import java.util.List;

public interface CRUD {
    public List listar();
    public Usuario listarCodigo (int codigo);
    public String add(String medicamento, String dosis, double precio_unitario, int cantidad_existencia, String laboratorio_farmaceutico, String vencimiento, String presentacion );
    public String edit(int codigo, String medicamento, String dosis, double precio_unitario, int cantidad_existencia, String laboratorio_farmaceutico, String vencimiento, String presentacion );
    public Usuario delete (int codigo);
    
}
