/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Marvin Lemen
 */
public class User {
     int Codigo;
     String Medicamento;
     String Dosis;
     double Precio_unitario;
     int Cantidad_existencia;
     String Laboratorio_farmaceutico;
     String Vencimiento;
     String Presentacion;
    
    public User(int Codigo, String Medicamento,String Dosis, double Precio_unitario, int Cantidad_existencia,String Laboratorio_farmaceutico, String Vencimiento, String Presentacion ){
        this.Codigo = Codigo;
        this.Medicamento = Medicamento;
        this.Dosis = Dosis;
        this.Precio_unitario = Precio_unitario;
        this.Cantidad_existencia = Cantidad_existencia;
        this.Laboratorio_farmaceutico = Laboratorio_farmaceutico;
        this.Vencimiento = Vencimiento;
        this.Presentacion = Presentacion;
    }

    public User() {
        
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the codigo to set
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the medicamento
     */
    public String getMedicamento() {
        return Medicamento;
    }

    /**
     * @param Medicamento the medicamento to set
     */
    public void setMedicamento(String Medicamento) {
        this.Medicamento = Medicamento;
    }

    /**
     * @return the dosis
     */
    public String getDosis() {
        return Dosis;
    }

    /**
     * @param Dosis the dosis to set
     */
    public void setDosis(String Dosis) {
        this.Dosis = Dosis;
    }

    /**
     * @return the precio_unitario
     */
    public double getPrecio_unitario() {
        return Precio_unitario;
    }

    /**
     * @param Precio_unitario the precio_unitario to set
     */
    public void setPrecio_unitario(double Precio_unitario) {
        this.Precio_unitario = Precio_unitario;
    }

    /**
     * @return the cantidad_existencia
     */
    public int getCantidad_existencia() {
        return Cantidad_existencia;
    }

    /**
     * @param Cantidad_existencia the cantidad_existencia to set
     */
    public void setCantidad_existencia(int Cantidad_existencia) {
        this.Cantidad_existencia = Cantidad_existencia;
    }

    /**
     * @return the laboratorio_farmaceutico
     */
    public String getLaboratorio_farmaceutico() {
        return Laboratorio_farmaceutico;
    }

    /**
     * @param Laboratorio_farmaceutico the laboratorio_farmaceutico to set
     */
    public void setLaboratorio_farmaceutico(String Laboratorio_farmaceutico) {
        this.Laboratorio_farmaceutico = Laboratorio_farmaceutico;
    }

    /**
     * @return the vencimiento
     */
    public String getVencimiento() {
        return Vencimiento;
    }

    /**
     * @param Vencimiento the vencimiento to set
     */
    public void setVencimiento(String Vencimiento) {
        this.Vencimiento = Vencimiento;
    }

    /**
     * @return the presentacion
     */
    public String getPresentacion() {
        return Presentacion;
    }

    /**
     * @param Presentacion the presentacion to set
     */
    public void setPresentacion(String Presentacion) {
        this.Presentacion = Presentacion;
    }

   
    
}
