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
public class Ejercicio3 {

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

    public void ImprimirEsquinas() {
        System.out.println("Los valores de las esquinas de la matriz son:" + "\n");
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < y; c++) {
                if ((f == 0) && (c == 0)) {
                    System.out.println(elementoMatriz[f][c]);
                }
                if (((f == 0) && (c == (y - 1)))) {
                    System.out.println(elementoMatriz[f][c]);
                }
                if (((f == x - 1) && (c == 0))) {
                    System.out.println(elementoMatriz[f][c]);
                }
                if (((f == (x - 1)) && (c == (y - 1)))) {
                    System.out.println(elementoMatriz[f][c]);
                }
            }
        }

    }

}
