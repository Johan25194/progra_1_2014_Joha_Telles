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
public class Ejercicio2 {
    private int x;
    private int y;
    private int [][] elemento;
    private int arreglo []; 
    Scanner teclado= new Scanner(System.in);
    
    public void ValidarMatriz(int pcolum,int pfil)
    {
    this.y=pcolum;
    this.x=pfil;
    elemento=new int [x][y];
    }
    
    
    public void CargarMatriz()
    {
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < y; c++) {
                System.out.println("Ingrese un valor a guardar");
                elemento[f][c]= teclado.nextInt();
            }
        }
    }
    public void IntercanviarColumna()
    {
        arreglo=new int [y];
        for (int a = 0; a < arreglo.length; a++) {
            if (arreglo[a]==0) {
                for (int c = 0; c < y; c++) {
                    arreglo[a]=elemento[0][a];
                }
            }
          
        }
        for (int c = 0; c < y; c++) {
            elemento[0][c]=elemento[1][c];
        }
        for (int c = 0; c < y; c++) {
            elemento[1][c]=arreglo[c];
        }
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < y; c++) {
                System.out.print(elemento[f][c]+" ");
            }
            System.out.println("");
        }
    }
   
    
}
