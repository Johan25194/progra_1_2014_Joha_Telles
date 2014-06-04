    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clss_8;

import java.util.Scanner;

/**
 *
 * @author JohanAdrian
 */
public class Clss_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opt;
        String palabra = "";
        Scanner teclado = new Scanner(System.in);
        Scanner oScanner = new Scanner(System.in);
        int n, n1;

        do {
            System.out.println("Ingrese una opccion");
            System.out.println("1.Ejercicipon_1");
            System.out.println("2.Ejercicipon_2");

            opt = oScanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.println(" Ingrese una cadena");

                    oScanner = new Scanner(System.in);//Resetiar

                    ejercicio1 put = new ejercicio1();

                    put.setCadena(oScanner.nextLine());
                    /*
                     System.out.println(put.Alrevez());
                     System.out.println(put.palíndromo());
                     */
                    System.out.println("Ingrese la palabra a marcar");

                    put.setBuscar(teclado.nextLine());
                    System.out.println(put.marque());
                    System.out.println(put.ocurrencia());
                    break;
                case 2:
                    oScanner = new Scanner(System.in);//Resetiar
                    clssejercicio2 tr = new clssejercicio2();
                    System.out.println("Ingrese una palabra");
                    tr.setCadenaDetexto(teclado.nextLine());
                    System.out.println("Ingrese otra pala palabra");
                    tr.setPalabraAbuscar(teclado.nextLine());
                    System.out.println(tr.caharAt());
                    System.out.println(tr.compareTo());
                    System.out.println("ingrese la posision begin");
                    n = teclado.nextInt();
                    System.out.println("ingrese la posision end");
                    n1 = teclado.nextInt();
                    System.out.println(tr.substring( n , n1));
                    System.out.println(tr.toUppercase());
                    System.out.println(tr.value(n));
                    break;
            }

        } while (opt < 5);

    }

}
