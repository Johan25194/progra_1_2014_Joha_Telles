/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaswitch;

import java.util.Scanner;

/**
 *
 * @author JohanAdrian
 */
public class PracticaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Intancia
        Scanner teclado = new Scanner(System.in);
        /*//Ejercicio 1 "Meses"
         int opt;
         do {
         System.out.println("Ingrese un  mumero de mes");
         opt = Integer.parseInt(teclado.nextLine());
         } while ((opt <= 0) || (opt > 12));

        
         switch (opt) {
         case 1:
         System.out.println("El mes es Enero");
         break;
         case 2:
         System.out.println("El mes es Febrero");
         break;
         case 3:
         System.out.println("El mes es Marzo");
         break;
         case 4:
         System.out.println("El mes es Abril");
         break;
         case 5:
         System.out.println("El mes es Mayo");
         break;
         case 6:
         System.out.println("El mes es Junio");
         break;
         case 7:
         System.out.println("El mes es Julio");
         case 8:
         System.out.println("El mes es Agosto");
         break;
         case 9:
         System.out.println("El mes es Septiembre");
         break;
         case 10:
         System.out.println("El mes es Octubre");
         break;
         case 11:
         System.out.println("El mes es Noviembre");
         break;
         case 12:
         System.out.println("El mes es Diciembre");
         break;

         }
         */
        /*
         //Ejercicio 2 "Terminaciones
         int n;
         int resul;
         System.out.println("Ingrese un numero entero ");
         n = Integer.parseInt(teclado.nextLine());
         resul = n % 10;
         if ((resul == 1) || (resul == 3) || (resul == 6)) {
         resul = 0;
         }

         switch (resul) {
         case (0):
         System.out.println("La solucion es:" + n);
         break;
         case (2):
         resul = resul * resul;
         System.out.println("La solucion es:" + resul);
         break;
         case (4):
         resul = resul * 5;
         System.out.println("La solucion es:" + resul);
         break;
         case (5):
         resul = resul * resul;
         System.out.println("La solucion es:" + resul);
         break;
         case (7):
         resul = resul * 5;
         System.out.println("La solucion es:" + resul);
         break;
         case (8):
         resul = resul * resul;
         System.out.println("La solucion es:" + resul);
         break;
         case (9):
         resul = resul * 5;
         System.out.println("La solucion es:" + resul);
         break;
         }
         */
        
        /*//Ejercicio 3

        char n;
        System.out.println("Ingrese una letra entre a,e");
        n = teclado.nextLine().charAt(0);
        if ((n == 'A')) {
            n = 'a';
        }
        if (n=='B')
        {
        n = 'b';
        }
        if(n=='C'){
        n = 'c';
        }
        if(n=='D'){
        n = 'd';
        }
        if(n=='E'){
        n='e';
        }

        switch (n) {
            case ('a'):
                System.out.println("Exelente");
                break;
            case ('b'):
                System.out.println("Bueno");
                break;
            case ('c'):
                System.out.println("Regular");
                break;
            case ('d'):
                System.out.println("Malo");
                break;
            case ('e'):
                System.out.println("Pesimo");
                break;
        }
                */

    }

}
