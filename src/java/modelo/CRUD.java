
package modelo;

import java.util.List;

public interface CRUD {
    public List listar();
    public User listarCodigo (int Codigo);
    public String add(String Medic, String Dos, double Precio, int Cantidad, String Lab, String Ven, String Pres );
    public String edit(int Codigo, String Medic, String Dos, double Precio, int Cantidad, String Lab, String Ven, String Pres );
    public User delete (int Codigo);
    
}
