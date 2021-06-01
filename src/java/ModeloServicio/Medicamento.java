/*
 * Copyright (C) 2021 
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

/**
 *
 * @author Marvin Alonso Lemen Sanchez 090-17-99
 * @author GIOVANI DAVID MEZA POGGIO 5990-18-14676
 * @author Wendy Pricila Cifuentes Lutin 5990-18-4413
 * @author Byron Rosbin Antonio Orozco 9941-19-23685
 * @author Karina Aracely Sanchez Ixcot 9941-19-264
 */

package ModeloServicio;

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
