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
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "Servicios")
public class Servicios {

    CRUDMedicamentos dao = new CRUDMedicamentos(); 
    
    @WebMethod(operationName = "listarMedicamentos")
    public List<Medicamento> listarMedicamentos() {
        List medicamentos = dao.listar();
        return medicamentos;
    }

    
    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "Medicamento") String Medicamento, @WebParam(name = "Dosis") String Dosis, @WebParam(name = "Precio_unitario") double Precio_unitario, @WebParam(name = "Cantidad_existencia") int Cantidad_existencia, @WebParam(name = "Laboratorio_farmaceutico") String Laboratorio_farmaceutico, @WebParam(name = "Vencimiento") String Vencimiento, @WebParam(name = "Presentacion") String Presentacion) {
        String datos = dao.add(Medicamento, Dosis, Precio_unitario, Cantidad_existencia, Laboratorio_farmaceutico, Vencimiento, Presentacion);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarcodigo")
    public Medicamento listarcodigo(@WebParam(name = "Codigo") int Codigo) {
        Medicamento medicamento=dao.listarCodigo(Codigo);
        
        return medicamento;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Actualizar")
    public String Actualizar(@WebParam(name = "Codigo") int Codigo, @WebParam(name = "Medicamento") String Medicamento, @WebParam(name = "Dosis") String Dosis, @WebParam(name = "Precio_unitario") double Precio_unitario, @WebParam(name = "Cantidad_existencia") int Cantidad_existencia, @WebParam(name = "Laboratorio_farmaceutico") String Laboratorio_farmaceutico, @WebParam(name = "Vencimiento") String Vencimiento, @WebParam(name = "Presentacion") String Presentacion) {
        String datos=dao.edit(Codigo, Medicamento, Dosis, Precio_unitario, Cantidad_existencia, Laboratorio_farmaceutico, Vencimiento, Presentacion);
        
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarLaboratorio")
    public List<Medicamento> listarLaboratorio(@WebParam(name = "LaboratorioFarmaceutico") String LaboratorioFarmaceutico) {
        
        List<Medicamento> medicamento = dao.listarLaboratorios(LaboratorioFarmaceutico);
        return medicamento;
    }

    
    @WebMethod(operationName = "Eliminar")
    public Medicamento Eliminar(@WebParam(name = "Codigo") int Codigo) {
        Medicamento u=dao.delete(Codigo);
        return u;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarNombre")
    public List<Medicamento> listarNombre(@WebParam(name = "nombreMedicamento") String nombreMedicamento) {
        List<Medicamento> listaNombres = dao.listarNombre(nombreMedicamento);
        return listaNombres;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarArchivo")
    public Integer insertarArchivo(@WebParam(name = "rutaArchivo") String rutaArchivo) {
        //TODO write your implementation code here:
        return null;
    }
}
