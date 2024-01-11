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
public class Otros implements Empleado{
      private Double salario;
    private String horario;
    private String labor;
    

    public Otros(String labor) {
    this.labor= labor;
    }
    @Override
    public Double calcularSalario(){
   return salario;
    }
    @Override
     public void mirarHorario(){
         System.out.println(horario);
    }

    public String getLabor() {
        return labor;
    }
     
}
