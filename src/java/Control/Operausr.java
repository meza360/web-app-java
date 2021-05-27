
package Control;
import javax.swing.JOptionPane;
import modelo.Crususr;
import Datos.Usuario;
/**
 *
 * @author Marvin Lemen
 */
public class Operausr extends Crususr {
    
    public String guardarusr (Usuario _usuario)
    {
       if(InsertUsuario ( _usuario))
       {
           JOptionPane.showMessageDialog(null, "No guardado");
       }else{
           JOptionPane.showMessageDialog(null, "Guardado");
           
       }
       System.out.println("Error");
        return null;
        
    

} 

    private boolean InsertUsuario(Usuario _usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    

    
    
}
