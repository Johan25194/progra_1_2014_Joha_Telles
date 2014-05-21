/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author JohanAdrian
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        boolean validar = true;
        double valor1 = 0;
        double valor2 = 0;
        double resultado;
        char continuar;
        int opcion = 0;

        //Instancia
        Scanner teclado = new Scanner(System.in);
        cls_operaciones ooperaciones = new cls_operaciones();
        //ciclo
        do {
            System.out.println("digite la operacion a evaluar");
            System.out.println("1.Suma.");
            System.out.println("2.Resta.");
            System.out.println("3.Division.");
            System.out.println("4.Multiplicacion.");
            System.out.println("5.Raiz.");
            System.out.println("6.Potencias.");
            System.out.println("7.Salir del menu.");

            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese una cantidad");
                    valor1 = Double.parseDouble(teclado.nextLine());
                    System.out.println("Ingrese la segunda cantidad");
                    valor2 = Double.parseDouble(teclado.nextLine());
                    resultado = ooperaciones.suma(valor1, valor2);
                    System.out.println("La SUMA ES DE:" + resultado);
                    break;
                case 2:
                    System.out.println("Ingrese el valor del primer digito");
                    valor1 = Double.parseDouble(teclado.nextLine());
                    System.out.println("Ingrese el valor del segundo digito");
                    valor2 = Double.parseDouble(teclado.nextLine());
                    resultado = ooperaciones.Resta(valor1, valor2);
                    System.out.println("La Resta ES DE:" + resultado);
                    break;
                case 3:
                    System.out.println("Ingrese el valor del primer digito");
                    valor1 = Double.parseDouble(teclado.nextLine());
                    System.out.println("Ingrese el valor del segundo digito");
                    valor2 = Double.parseDouble(teclado.nextLine());
                    if (valor2 == 0) {
                        do {
                            System.out.println("Error ingrese un numero mayor que cero");
                            System.out.println("Ingrese el valor del segundo digito");
                            valor2 = Double.parseDouble(teclado.nextLine());
                        } while (valor2 == 0);

                    }
                    resultado = ooperaciones.Divicion(valor1, valor2);
                    System.out.println("El resultado de la division es:" + resultado);
                    break;
                case 4:
                    System.out.println("Ingrese el valor del primer digito");
                    valor1 = Double.parseDouble(teclado.nextLine());
                    System.out.println("Ingrese el valor del segundo digito");
                    valor2 = Double.parseDouble(teclado.nextLine());
                    resultado = ooperaciones.Multiplicacion(valor1, valor2);
                    System.out.println("El resultado de la multiplicacion es:" + resultado);
                    break;
                case 5:
                    System.out.println("Ingrese el valor del primer digito");
                    valor1 = Double.parseDouble(teclado.nextLine());
                    resultado = ooperaciones.Raiz(valor1);
                    System.out.println("El resultado de la multiplicacion es:" + resultado);
                    break;
                case 6:
                    System.out.println("Ingrese el valor del primer digito");
                    valor1 = Double.parseDouble(teclado.nextLine());
                    System.out.println("Ingrese el valor del segundo digito que va ser la potencia");
                    valor2 = Double.parseDouble(teclado.nextLine());
                    resultado = ooperaciones.Multiplicacion(valor1, valor2);
                    System.out.println("El resultado de la potencia es:" + resultado);
                    break;

            }

            System.out.println("Desea continuar con otra operaracion s/n");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 's') || (continuar == 'S')) {

                validar = true;
            } else {
                validar = false;

            }

        } while (validar);

    }

}
