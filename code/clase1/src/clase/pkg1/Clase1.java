/*
 * Name:Clss1                                                                                                                                    
 * Insormation:This is the first class
 * Date:07/05/2014 
 * Copyright
 
 
 */
package clase.pkg1;

import java.io.IOException;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Date;



/**
 *
 * @author Estudiante
 */
public class Clase1 {
  

    /**
     * @param args the command line arguments This is the main method
     */
    public static void main(String[] args) throws IOException {
        double horasTrabajadas = 0;
        double costoHora = 0;
        double Salario = 0;
     
        Scanner teclado = new Scanner(System.in);

        out.print("Hello world" + "\n");

        out.print("Digite las horas laboradas por el trabajador"+"\n");

        horasTrabajadas = Double.parseDouble(teclado.nextLine());

        out.print("Digite el costo por hora" + "\n");
        costoHora = Double.parseDouble(teclado.nextLine());
        Salario = horasTrabajadas * costoHora;

        out.print("El salario final es" + Salario + "\n");
        
        out.print("Date" + Date + "\n");
       
        // System.out.print("Java epic win" + "\n");
       




    }
}
