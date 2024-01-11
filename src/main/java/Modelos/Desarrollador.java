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
public class Desarrollador implements Empleado {
      private Double salario;
    private String telefono;
    private int horas, nivel;
    

    public Desarrollador( int horas, int nivel, String telefono) {
        this.horas = horas;
        this.nivel = nivel;
        this.telefono = telefono;
    }

    
    @Override
    public Double calcularSalario(){
        salario=70000.0*horas*nivel;
   return salario;
    }
    @Override
     public void mirarHorario(){
         System.out.println("Consultar el horario al siguiente telefono:" + telefono);
    }
}
