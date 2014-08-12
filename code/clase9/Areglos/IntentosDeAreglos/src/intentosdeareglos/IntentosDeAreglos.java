/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intentosdeareglos;

import java.util.Scanner;

/**
 *
 * @author JohanAdrian
 */
public class IntentosDeAreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int option;
        do {
            System.out.println("Digite una opcion:");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2:");
             System.out.println("Ejercicio 3:");
              System.out.println("Ejercicio 4:");
            System.out.println("Salir 5;");
            option = teclado.nextInt();
            switch (option) {
                case 1:
                    clssVector oclVector = new clssVector();
                    for (int i = 0; i <= 7; i++) {
                        System.out.println("Digite la cantidad #" + (1 + i));
                        oclVector.AgregarVectores(teclado.nextInt());
                    }
                    System.out.println(oclVector.SumaDeVectores());
                    System.out.println(oclVector.AnalizarVector());
                    break;
                case 2:
                    ejerccio2 oejerccio2 = new ejerccio2();
                    for (int e = 0; e <= 3; e++) {
                        System.out.println("Digite la cantidad #" + (1 + e));
                        oejerccio2.AgregarVector1(teclado.nextInt());
                    }
                    System.out.println("Cargar vector2");
                    for (int i = 0; i <= 3; i++) {
                        System.out.println("Digite la cantidad #" + (1 + i));
                        oejerccio2.AgregarDeVector2(teclado.nextInt());
                    }
                    System.out.println(oejerccio2.Imprimir());
                    break;
                case 3:
                    clssNotas oclNotas= new clssNotas();
                      System.out.println("Ingrese las notas del grupo A");
                    for (int i = 0; i <=4; i++) {
                         System.out.println("Ingrese las notas #"+(i+1));
                          oclNotas.AgregarElementos(teclado.nextDouble());
                    }
                    System.out.println("Ingrese las notas del grupo B");
                    for (int i = 0; i <=4; i++) {
                          System.out.println("Ingrese las notas #"+(i+1));
                          oclNotas.AgregarElementos(teclado.nextDouble());
                    }
                    System.out.println(oclNotas.PromedioGeneral());
                  
                    break;
                case 4:
                    clssOrden oclssOrden = new clssOrden();
                    System.out.println("Ingresar digitos desoadenados");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Ingrese el valor #"+(i+1));
                        oclssOrden.AgregaraElementos(teclado.nextInt());
                    }
                    System.out.println(oclssOrden.VerificarOrden());
                    
                    break;

            }

        } while (option<=4);

    }

}
