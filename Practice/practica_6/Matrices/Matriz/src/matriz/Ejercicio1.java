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
public class Ejercicio1 {
    private int [][] Matriz;
    Scanner teclado = new Scanner(System.in);
    
    public void CargarMatriz()
    {
        Matriz=new int [2][5];
        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.println("Ingrese el valor a guardar");
                Matriz[f][c]=teclado.nextInt();
            }
        }
    
    }
    public void Imprimir()
    {
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(Matriz[f][c]+"-");
            }
            System.out.println("");
        }
    
    }
    
}
