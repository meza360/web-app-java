/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Crususr;
import modelo.User;

/**
 *
 * @author Marvin Lemen
 */
@WebService(serviceName = "Servicios")
public class Servicios {

    Crususr dao=new Crususr(); 
    @WebMethod(operationName = "listar")
    public List<User> listar() {
        List datos=dao.listar();
        return datos;
    }
}
