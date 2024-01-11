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
public class PSG implements Empleado{  
    double salarioMinimo= 1160000;
    private Double salario= 1.5*salarioMinimo;
    private String horario="7 a 12 pm, 1 a 4 pm";


    public PSG() {
       
       
    }
    @Override
    public Double calcularSalario(){
   return salario;
    }
    @Override
     public void mirarHorario(){
         System.out.println(horario);
    }
    
    
}
