/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author JohanAdrian
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fila, columna;
        Scanner teclado = new Scanner(System.in);
        // TODO code application logic here
       /* Ejercicio1 oesEjercicio1 = new Ejercicio1();
         oesEjercicio1.CargarMatriz();
         oesEjercicio1.Imprimir();
         */

        /* Ejercicio2 osleEjercicio2 = new Ejercicio2();
         System.out.println("Ingrese la cantidad de columnas en la matriz");
         columna = teclado.nextInt();
         System.out.println("Ingrese la cantidad de filas de  la matriz");
         fila = teclado.nextInt();
         osleEjercicio2.ValidarMatriz( columna, fila);
         osleEjercicio2.CargarMatriz();
         osleEjercicio2.IntercanviarColumna();
         */
      /*  Ejercicio3 oseEjercicio3 = new Ejercicio3();
        System.out.println("Ingrese la cantidad de columnas  en la matriz");
        columna = teclado.nextInt();
        System.out.println("Ingrese la cantidad de filas de  la matriz");
        fila = teclado.nextInt();
        oseEjercicio3.ValidarMatriz( columna, fila);
        oseEjercicio3.CargarMatriz();
       oseEjercicio3.ImprimirEsquinas();
       */
        Ejercicio4 oseEjercicio4 = new Ejercicio4();
        System.out.println("Ingrese la cantidad de columnas  en la matriz");
        columna = teclado.nextInt();
        System.out.println("Ingrese la cantidad de filas de  la matriz");
        fila = teclado.nextInt();
        oseEjercicio4.ValidarMatriz( columna, fila);
        oseEjercicio4.CargarMatriz();
       oseEjercicio4.BuscarElMayor();
    }

}
