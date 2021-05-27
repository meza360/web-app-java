
package Datos;

/**
 *
 * @author Marvin Lemen
 */
public class Usuario {
    
    private int codigo;
    private String medicamento;
    private String dosis;
    private Double precio_unitario;
    private int cantidad_existencia;
    private String laboratorio_farmaceutico;
    private String vencimiento;
    private String presentacion;
    
    public Usuario(int codigo, String medicamento,String dosis, Double precio_unitario, int cantidad_existencia,String laboratorio_farmaceutico, String vencimiento, String presentacion ){
        this.codigo = codigo;
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.precio_unitario = precio_unitario;
        this.cantidad_existencia = cantidad_existencia;
        this.laboratorio_farmaceutico = laboratorio_farmaceutico;
        this.vencimiento = vencimiento;
        this.presentacion = presentacion;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the medicamento
     */
    public String getMedicamento() {
        return medicamento;
    }

    /**
     * @param medicamento the medicamento to set
     */
    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    /**
     * @return the dosis
     */
    public String getDosis() {
        return dosis;
    }

    /**
     * @param dosis the dosis to set
     */
    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    /**
     * @return the precio_unitario
     */
    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    /**
     * @param precio_unitario the precio_unitario to set
     */
    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    /**
     * @return the cantidad_existencia
     */
    public int getCantidad_existencia() {
        return cantidad_existencia;
    }

    /**
     * @param cantidad_existencia the cantidad_existencia to set
     */
    public void setCantidad_existencia(int cantidad_existencia) {
        this.cantidad_existencia = cantidad_existencia;
    }

    /**
     * @return the laboratorio_farmaceutico
     */
    public String getLaboratorio_farmaceutico() {
        return laboratorio_farmaceutico;
    }

    /**
     * @param laboratorio_farmaceutico the laboratorio_farmaceutico to set
     */
    public void setLaboratorio_farmaceutico(String laboratorio_farmaceutico) {
        this.laboratorio_farmaceutico = laboratorio_farmaceutico;
    }

    /**
     * @return the vencimiento
     */
    public String getVencimiento() {
        return vencimiento;
    }

    /**
     * @param vencimiento the vencimiento to set
     */
    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    /**
     * @return the presentacion
     */
    public String getPresentacion() {
        return presentacion;
    }

    /**
     * @param presentacion the presentacion to set
     */
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
    
}
