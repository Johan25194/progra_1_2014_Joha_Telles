/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppractica_2;

import java.util.Scanner;

/**
 *
 * @author JohanAdrian
 */
public class AppPractica_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         *Ejercicio 1.
         */
        int a;
        int cont = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        a = Integer.parseInt(teclado.nextLine());

        do {
            System.out.print("*" + "\n");
            cont = cont + 1;

        } while (cont <= a);

        /*
         *Ejercicio 2.
         */
        int n;
        int y;

        System.out.println("Ingrese un numero");
        n = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el numero para remplazar ");
        y = Integer.parseInt(teclado.nextLine());

        for (int i = 1; i <= n; i++) {
            if ((i % y) == 0) {
                System.out.println("*");
            } else {
                System.out.println(i);
            }

        }
        
        double inicial;
        double incremento;
        double terninal;
        
        System.out.println("Ingrese un numero de inicio");
        inicial= Double.parseDouble(teclado.nextLine());
        System.out.println("Ingrese un valor final");
        terninal=Double.parseDouble(teclado.nextLine());
        System.out.println("Ingrese un valor para incrementar el valor inicial");
        incremento=Double.parseDouble(teclado.nextLine());
        
        double suma=0;
        for (double i = suma; i < terninal; i=i+suma) {
            
        }

    }

}
