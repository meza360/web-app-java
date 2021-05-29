/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloServicio;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Marvin Lemen
 */
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
}
