/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author JohanAdrian
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opt = 0;
        Scanner oScanner = new Scanner(System.in);

        do {

            System.out.println("Digite la opcion que desea");
            System.out.println("1:Ejercicio 1");
            System.out.println("2:Ejercicio 2");
            opt = oScanner.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Digite le correo a evaluar");
                    ejercicio1 oeScanner = new ejercicio1(oScanner.nextLine());
                    System.out.println(oeScanner.validarCorreo());
                    break;
                case 2:
                    System.out.println("Digite la cadena a evaluar");
                    ejercicio2 oejercicio2 = new ejercicio2();
                    oScanner = new Scanner(System.in);
                    oejercicio2.setCadena(oScanner.nextLine());
                    System.out.println(oejercicio2.MediaCadena());
                    System.out.println(oejercicio2.UltimoValor());
                     System.out.println(oejercicio2.Alrevez());
                    System.out.println(oejercicio2.Guion());
                    System.out.println( "Tiene una cantidad de:" + oejercicio2.Vocales()+ "vocales");
                    System.out.println(oejercicio2.Palindromo());
                             
                    
                    break;

            }

        } while (opt <= 7);

    }

}
