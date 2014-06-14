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
public class Ejercicio4 {
    
    private int x;
    private int y;
    private int[][] elementoMatriz;

    Scanner teclado = new Scanner(System.in);

    public void ValidarMatriz(int pcolum, int pfil) {
        this.y = pcolum;
        this.x = pfil;
        elementoMatriz = new int[x][y];
    }

    public void CargarMatriz() {
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < y; c++) {
                System.out.println("Ingrese un valor a guardar");
                elementoMatriz[f][c] = teclado.nextInt();
            }

        }
      
    }
    
    public void BuscarElMayor()
    {
        int cont = 0;
        int valor = 0;
        for (int f = 0; f <x; f++) {
            for (int c = 0; c <y; c++) {
                for (int fl = 0; fl < x; fl++) {
                    for (int cc = 0; cc < y; cc++) {
                         if (elementoMatriz[f][c]>elementoMatriz[fl][cc]) {
                    cont++;
                    valor=elementoMatriz[f][c];
                }
                    }
                    
                }
               
            }
        }
        if(cont==(x*y)-1)
        {
            for (int f = 0; f <x; f++) {
                for (int c = 0; c <y; c++) {
                    if (elementoMatriz[f][c]==valor) {
                        System.out.println("El numero mayor es: " + valor+ "\n" + "Se encuentra en la posicion:"  + "("+ f +","+    c+")");
                    }
                }
                
            }
        }
    
    }
    
}
