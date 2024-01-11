
import Modelos.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Otros objOtros = new Otros("arquitecto");
      PSG objPSG = new PSG();
      PDM objPDM = new PDM(100000.0);
      Desarrollador objDesarrollador = new Desarrollador( 20, 2, "31750014");
      
      ArrayList <Empleado> listaEmpleados= new ArrayList();
      listaEmpleados.add(objOtros);
        listaEmpleados.add(objPSG);
          listaEmpleados.add(objPDM);
            listaEmpleados.add(objDesarrollador);
            
            for(int i=0; i< listaEmpleados.size();i++){
                mostrarSalarioHorario(listaEmpleados.get(i));
            }
      
      
    }
    public static void mostrarSalarioHorario(Empleado e){
        if(e instanceof Otros){
            Otros otrosobj= (Otros)e;
            System.out.println("El empleado tiene un salario de acuerdo a su labor de " + otrosobj.getLabor() );
              System.out.println("El empleado tiene un horario de oficina");
   
    
    }else{
        Double salario;
        if( e instanceof PSG){
            System.out.println("\n El salario de la persona de servicios genereales es: "  + e.calcularSalario());          
         
        }
         if( e instanceof PDM){
            System.out.println("\n El salario de la persona de mercadeo es: "  + e.calcularSalario());
        }
          if( e instanceof Desarrollador){
            System.out.println("\n El salario de la persona de desarrollo es: "  + e.calcularSalario());
        }
           e. mirarHorario();
            
            
        }
    }
    
}
