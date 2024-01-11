/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author felip
 */
public class PDM implements Empleado
        {
  private Double salario;
    private String horario="8 a 12 pm, 2 a 6 pm";
    Double totalEnVentas;

    public PDM(Double totalEnVentas) {
        this.totalEnVentas= totalEnVentas;
       
    }
    @Override
    public Double calcularSalario(){
        salario=1000000+(totalEnVentas*3)/100; 
   return salario;
    }
    @Override
     public void mirarHorario(){
         System.out.println(horario);
    }   
}
