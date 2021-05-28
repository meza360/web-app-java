package ModeloServicio;

/**
 *
 * @author Marvin Lemen
 */
public class Medicamento {
    
     private int Codigo;
     private String Medicamento;
     private String Dosis;
     private double Precio_unitario;
     private int Cantidad_existencia;
     private String Laboratorio_farmaceutico;
     private String Vencimiento;
     private String Presentacion;
      
     public Medicamento() {}
      
    public Medicamento(int Codigo, String Medicamento,String Dosis, double Precio_unitario, int Cantidad_existencia,String Laboratorio_farmaceutico, String Vencimiento, String Presentacion ){
        this.Codigo = Codigo;
        this.Medicamento = Medicamento;
        this.Dosis = Dosis;
        this.Precio_unitario = Precio_unitario;
        this.Cantidad_existencia = Cantidad_existencia;
        this.Laboratorio_farmaceutico = Laboratorio_farmaceutico;
        this.Vencimiento = Vencimiento;
        this.Presentacion = Presentacion;
    }

    public String getPresentacion() {
        return Presentacion;
    }

    public void setPresentacion(String Presentacion) {
        this.Presentacion = Presentacion;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getMedicamento() {
        return Medicamento;
    }

    public void setMedicamento(String Medicamento) {
        this.Medicamento = Medicamento;
    }

    public String getDosis() {
        return Dosis;
    }

    public void setDosis(String Dosis) {
        this.Dosis = Dosis;
    }

    public double getPrecio_unitario() {
        return Precio_unitario;
    }

    public void setPrecio_unitario(double Precio_unitario) {
        this.Precio_unitario = Precio_unitario;
    }

    public int getCantidad_existencia() {
        return Cantidad_existencia;
    }

    public void setCantidad_existencia(int Cantidad_existencia) {
        this.Cantidad_existencia = Cantidad_existencia;
    }

    public String getLaboratorio_farmaceutico() {
        return Laboratorio_farmaceutico;
    }

    public void setLaboratorio_farmaceutico(String Laboratorio_farmaceutico) {
        this.Laboratorio_farmaceutico = Laboratorio_farmaceutico;
    }

    public String getVencimiento() {
        return Vencimiento;
    }

    public void setVencimiento(String Vencimiento) {
        this.Vencimiento = Vencimiento;
    }

  

   
    
}
