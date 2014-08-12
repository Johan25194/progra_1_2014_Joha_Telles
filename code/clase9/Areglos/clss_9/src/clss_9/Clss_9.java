/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clss_9;

import java.util.Scanner;

/**
 *
 * @author JohanAdrian
 */
public class Clss_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salario;
        int option;
        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Digite la opccion del ejercicio a evaluar");
            System.out.println("1:Ejercicio 1");
            System.out.println("2:Ejercicio 2");
            System.out.println("3:Ejercicio 3");
            System.out.println("4:Salir");

            option = teclado.nextInt();

            switch (option) {
                case 1:
                    ejercicio1 put = new ejercicio1();

                    for (int i = 0; i <= 4; i++) {

                        teclado = new Scanner(System.in);
                        System.out.println("Digite el salario del trabajador # " + (i + 1));
                        put.AgregarSalario(teclado.nextDouble());
                    }
                    System.out.println(put.ImprimirSueldo());
                    break;
                case 2:
                    ejercici2 tr = new ejercici2();

                    for (int i = 0; i <= 4; i++) {

                        teclado = new Scanner(System.in);
                        System.out.println("Digite la altura # " + (i + 1));
                        tr.AgregarAltura(teclado.nextFloat());
                    }
                    System.out.println("El promedio es de: " + tr.promedio());
                    System.out.println(tr.ContrataPersona());
                    break;
                case 3:
                    ejercicio3 ms = new ejercicio3();

                    for (int i = 0; i <4; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite el salario del turno de la mañana # " + (i + 1));
                        ms.GuardarSalarioMañana(teclado.nextDouble());
                    }
                    for (int i = 0; i <4; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite el salario del turno de la tarde # " + (i + 1));
                        ms.GuardarSalarioTarde(teclado.nextDouble());
                    }
                    System.out.println(ms.SalarioMañana());
                    System.out.println(ms.SalarioTarde());
                    break;
            }

        } while (option <= 3);

    }

}
