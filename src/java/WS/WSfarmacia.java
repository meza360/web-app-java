
package WS;

import Datos.Usuario;
import Control.Operausr;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Marvin Lemen
 */
@WebService(serviceName = "WSfarmacia")
public class WSfarmacia {

    @WebMethod(operationName ="GuardarUsuario")
    public String guardarusr(@WebParam(name = "Codigo") int Codigo, @WebParam(name = "Medicamento") String Medicamento, @WebParam(name = "Dosis") String Dosis, @WebParam(name = "Precio_unitario")Double Precio_unitario, @WebParam(name = "Cantidad_existencia") int Cantidad_existencia, @WebParam(name = "Laboratorio_farmaceutico") String Laboratorio_farmaceutico, @WebParam(name = "Vencimiento") String Vencimiento, @WebParam(name = "Presentacion")String Presentacion) {
        
    Usuario objusuario = new Usuario();
        Operausr objOperausr = new Operausr(); 
        
        
        objusuario.setCodigo(Codigo);
        objusuario.setMedicamento(Medicamento);
        objusuario.setDosis(Dosis);
        objusuario.setPrecio_unitario(Precio_unitario);
        objusuario.setCantidad_existencia(Cantidad_existencia);
        objusuario.setLaboratorio_farmaceutico(Laboratorio_farmaceutico);
        objusuario.setVencimiento(Vencimiento);
        objusuario.setPresentacion(Presentacion);
        
        
        
        
        return objOperausr.guardarusr(objusuario);
        
    }
}
