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
public class Ejercicio3 {

    private int[][] matriz;
    private Scanner teclado;

    public void CargarMatriz() {
        teclado = new Scanner(System.in);
        matriz = new int[3][4];

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Ingrese un numero corespondiente");
                matriz[f][c] = teclado.nextInt();
            }

        }
    }

    public void PrimeraFila() {
        System.out.println("Imprimir la primera fila de matriz");
        for (int c = 0; c < 4; c++) {
            System.out.println(matriz[0][c]);
        }
    }

    public void UltimaFila() {
        System.out.println("Imprimir la ultima fila de matriz");
        for (int c = 0; c < 4; c++) {
            System.out.println(matriz[2][c]);
        }
    }

    public void PrimeraColumna() {
        System.out.println("Imprimir la primera columna");
        for (int f = 0; f < 3; f++) {
            System.out.println(matriz[f][0]);
        }
    }

    public void UltimaColumna() {
        System.out.println("Imprimir la Ultima columna");
        for (int f = 0; f < 3; f++) {
            System.out.println(matriz[f][3]);
        }
    }
}
