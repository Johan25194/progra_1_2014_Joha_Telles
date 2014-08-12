/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clss_9;

/**
 *
 * @author JohanAdrian
 */
public class ejercicio1 {
    //Esto es un areglo
    double[] salario = new double[5];
    
    public void AgregarSalario(double psalario)
    {
        for (int i = 0; i < salario.length; i++) {
           if(salario[i]==0)
           {
           salario[i]=psalario;
           break;
           } 
        }
    }
    public String ImprimirSueldo()
    {
    String imprimir="";
        for (int i = 0; i < salario.length; i++) {
            imprimir+="El salario del trabajador # "+(i+1)+"es de: "+salario[i]+'\n';    
        }
        return imprimir;
    }
    
    
    
}
