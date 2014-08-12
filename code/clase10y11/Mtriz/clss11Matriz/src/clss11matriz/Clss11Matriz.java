/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clss11matriz;

import java.util.Scanner;

/**
 *
 * @author JohanAdrian
 */
public class Clss11Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opt;
        Scanner teclado = new Scanner(System.in);
        do {

            System.out.println("Ingrese una opcion");
            System.out.println("1.Ejercicio1");
            System.out.println("2.Ejercicio2");
            System.out.println("3.Ejercicio3");
              System.out.println("4.Salir");
            opt = teclado.nextInt();
            switch (opt) {
                case 1:
                    Ejercicio1 oeEjercicio1 = new Ejercicio1();
                    oeEjercicio1.CargarMatriz();
                    oeEjercicio1.Imprimir();
                    break;
                case 2:
                    Ejercicio2 oeEjercicio2 = new Ejercicio2();
                    oeEjercicio2.CargarMatriz();
                    oeEjercicio2.ImprimirDiagonal();
                    break;
                    case 3:
                    Ejercicio3 oeEjercicio3 = new Ejercicio3();
                    oeEjercicio3.CargarMatriz();
                    oeEjercicio3.PrimeraFila();
                     oeEjercicio3.UltimaFila();
                     oeEjercicio3.PrimeraColumna();
                     oeEjercicio3.UltimaColumna();
                    break;
            }

        } while (opt < 4);

    }

}
