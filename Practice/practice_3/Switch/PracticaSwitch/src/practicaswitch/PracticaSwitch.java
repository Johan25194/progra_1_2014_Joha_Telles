/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaswitch;

import static java.lang.Math.random;
import java.util.Scanner;

/**
 *
 * @author JohanAdrian
 */
public class PracticaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Intancia
        Scanner teclado = new Scanner(System.in);
        /*//Ejercicio 1 "Meses"
         int opt;
         do {
         System.out.println("Ingrese un  mumero de mes");
         opt = Integer.parseInt(teclado.nextLine());
         } while ((opt <= 0) || (opt > 12));
        
         switch (opt) {
         case 1:
         System.out.println("El mes es Enero");
         break;
         case 2:
         System.out.println("El mes es Febrero");
         break;
         case 3:
         System.out.println("El mes es Marzo");
         break;
         case 4:
         System.out.println("El mes es Abril");
         break;
         case 5:
         System.out.println("El mes es Mayo");
         break;
         case 6:
         System.out.println("El mes es Junio");
         break;
         case 7:
         System.out.println("El mes es Julio");
         case 8:
         System.out.println("El mes es Agosto");
         break;
         case 9:
         System.out.println("El mes es Septiembre");
         break;
         case 10:
         System.out.println("El mes es Octubre");
         break;
         case 11:
         System.out.println("El mes es Noviembre");
         break;
         case 12:
         System.out.println("El mes es Diciembre");
         break;

         }
         */
        /*
         //Ejercicio 2 "Terminaciones
         int n;
         int resul;
         System.out.println("Ingrese un numero entero ");
         n = Integer.parseInt(teclado.nextLine());
         resul = n % 10;
         if ((resul == 1) || (resul == 3) || (resul == 6)) {
         resul = 0;
         }

         switch (resul) {
         case (0):
         System.out.println("La solucion es:" + n);
         break;
         case (2):
         resul = resul * resul;
         System.out.println("La solucion es:" + resul);
         break;
         case (4):
         resul = resul * 5;
         System.out.println("La solucion es:" + resul);
         break;
         case (5):
         resul = resul * resul;
         System.out.println("La solucion es:" + resul);
         break;
         case (7):
         resul = resul * 5;
         System.out.println("La solucion es:" + resul);
         break;
         case (8):
         resul = resul * resul;
         System.out.println("La solucion es:" + resul);
         break;
         case (9):
         resul = resul * 5;
         System.out.println("La solucion es:" + resul);
         break;
         }
         */

        /*//Ejercicio 3

         char n;
         System.out.println("Ingrese una letra entre a,e");
         n = teclado.nextLine().charAt(0);
         if ((n == 'A')) {
         n = 'a';
         }
         if (n=='B')
         {
         n = 'b';
         }
         if(n=='C'){
         n = 'c';
         }
         if(n=='D'){
         n = 'd';
         }
         if(n=='E'){
         n='e';
         }

         switch (n) {
         case ('a'):
         System.out.println("Exelente");
         break;
         case ('b'):
         System.out.println("Bueno");
         break;
         case ('c'):
         System.out.println("Regular");
         break;
         case ('d'):
         System.out.println("Malo");
         break;
         case ('e'):
         System.out.println("Pesimo");
         break;
         }
         */
        //Ejercicio 4
       /* int n;
         int m;
         boolean r;

         System.out.println("Ingrese un año");
         n = Integer.parseInt(teclado.nextLine());
         System.out.println("Digite el numero de mes");
         m = Integer.parseInt(teclado.nextLine());

         if ((n % 4 == 0) &&(n%100!=0)|| (n % 400 == 0)) {
         r = true;
         } else {
         r = false;
         }

         switch (m) {
         case 1:
         System.out.println("El año" + "  " + n + " " +
         " tiene 31 dias y corresponde al mes de Enero.");
         break;
         case 2:
         if (r == true) {
         System.out.println("El año" + "  " + n + "  " +
         " tiene 29 dias y corresponde al mes de Febrero.");
         } else {
         System.out.println("El años " + "  " + n + "  " +
         " tiene 28 dias y corresponde al mes de Febrero.");
         }
         break;
         case 3:
         System.out.println("El años " + "  " + n + "  " +
         " tiene 31 dias y corresponde al mes de Marzo.");
         break;
         case 4:
         System.out.println("El años " + "  " + n + "  " +
         " tiene 30 dias y corresponde al mes de Abril");
         break;
         case 5:
         System.out.println("El años " + "  " + n + "  " +
         " tiene 31 dias y corresponde al mes de Mayo.");
         break;
         case 6:
         System.out.println("El años " + "  " + n + "  " +
         " tiene 30 dias y corresponde al mes de Junio.");
         break;
         case 7:
         System.out.println("El años " + "  " + n + "  " +
         " tiene 31 dias y corresponde al mes de Julio.");
         break;
         case 8:
         System.out.println("El años " + "  " + n + "  " +
         " tiene 30 dias y corresponde al mes de Agosto.");
         break;
         case 9:
         System.out.println("El años " + "  " + n + "  " +
         " tiene 30 dias y corresponde al mes de Septiembre.");
         break;
         case 10:
         System.out.println("El años " + "  " + n + "  " +
         " tiene 31 dias y corresponde al mes de Octubre.");
         break;
         case 11:
         System.out.println("El años " + "  " + n + "  " +
         " tiene 30 dias y corresponde al mes de Noviembre.");
         break;
         case 12:
         System.out.println("El años " + "  " + n + "  " +
         " tiene 31 dias y corresponde al mes de Diciembre.");
         break;
         }
         */
        //Ejercicio numero 5
        /*
         int r = 0;
         int n;
         int y =1;
        
         for (int x = 0; x <3000; x++) {
         System.out.println("  ");
            
         r = 1+(int)(Math.random()*3000);
        
         System.out.print(y++ +":"+ "Alatorio" +":" + r +"=");
        
         if(r>=1000){
         do {
         r = r - 1000;
         System.out.print("M");
         } while (r >= 1000);
         }
         if ((r < 1000) && (r >= 900)) {
         r = r - 900;
         System.out.print("CM");
         }
         if ((r < 900) && (r >= 800)) {
         System.out.print("DCCC");
         r = r - 800;
         }
         if ((r < 800) && (r >= 700)) {
         System.out.print("DCC");
         r = r - 700;
         }
         if ((r < 700) && (r >= 600)) {
         System.out.print("DC");
         r = r - 600;
         }
         if ((r < 600) && (r >= 500)) {
         System.out.print("D");
         r = r - 500;
         }
         if ((r < 500) && (r >= 400)) {
         System.out.print("CD");
         r = r - 400;
         }
         if ((r < 400) && (r >= 300)) {
         System.out.print("CCC");
         r = r - 300;
         }
         if ((r < 300) && (r >= 200)) {
         System.out.print("CC");
         r = r - 200;
         }
         if ((r < 200) && (r >= 100)) {
         System.out.print("C");
         r = r - 100;
         }
         if ((r < 100) && (r >= 90)) {
         System.out.print("XC");
         r = r - 90;
         }
         if ((r < 90) && (r >= 80)) {
         System.out.print("LXXX");
         r = r - 80;
         }
         if ((r < 80) && (r >= 70)) {
         System.out.print("LXX");
         r = r - 70;
         }
         if ((r < 70) && (r >= 60)) {
         System.out.print("LX");
         r = r - 60;
         }
         if ((r < 60) && (r >= 50)) {
         System.out.print("L");
         r = r - 50;
         }
         if ((r < 50) && (r >= 40)) {
         System.out.print("XL");
         r = r - 40;
         }
         if ((r < 40) && (r >= 30)) {
         System.out.print("XXX");
         r = r - 30;
         }
         if ((r < 30) && (r >= 20)) {
         System.out.print("XX");
         r = r - 20;
         }
         if ((r < 20) && (r >= 10)) {
         System.out.print("X");
         r = r - 10;
         }
         if ((r < 10) && (r >= 9)) {
         System.out.print("IX");
         r = r - 9;
         }
         if ((r < 9) && (r >= 8)) {
         System.out.print("VIII");
         r = r - 8;
         }
         if ((r < 8) && (r >= 7)) {
         System.out.print("VII");
         r = r - 7;
         }
         if ((r < 7) && (r >= 6)) {
         System.out.print("VI");
         r = r - 6;
         }
         if ((r < 6) && (r >= 5)) {
         System.out.print("V");
         r = r - 5;
         }
         if ((r < 5) && (r >= 4)) {
         System.out.print("IV");
         r = r - 4;
         }
         if ((r < 4) && (r >= 3)) {
         System.out.print("III");
         r = r - 3;
         }
         if ((r < 3) && (r >= 2)) {
         System.out.print("II");
         r = r - 2;
         }
         if ((r < 2) && (r >= 1)) {
         System.out.print("I");
         r = r - 9;
         }
         }
         */
        //Ejercicio numero 6 fecha anterior.
        int año, mes, dia;
        char respuesta = 'n';
        boolean r;
        boolean di = true;

        do {
            System.out.println("Digite el año");
            año = Integer.parseInt(teclado.nextLine());
            if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
                r = true;
            } else {
                r = false;
            }
            do {
                System.out.println("Digite el mes");
                mes = Integer.parseInt(teclado.nextLine());
            } while ((mes > 12) || (mes < 1));

            do {
                di = true;
                System.out.println("Digite el dia");
                dia = Integer.parseInt(teclado.nextLine());

                switch (mes) {

                    case 1:
                        if (dia > 31) {
                            System.out.println("Erroor"
                                    + "\n" + "Este mes es Enero y tiene 31 dia");
                            di = false;
                        }
                        break;
                    case 2:
                        if (r == true) {
                            if (dia > 29) {
                                System.out.println("Erroor"
                                        + "\n" + "Este mes es Febrero tiene 29 dia");
                                di = false;
                            }

                        } else {
                            if (dia > 28) {
                                System.out.println("Erroor"
                                        + "\n" + "Este mes Febrero y tiene 28 dia");
                                di = false;
                            }
                        }
                        break;
                    case 3:
                        if (dia > 31) {
                            System.out.println("Erroor"
                                    + "\n" + "Este mes es Marzo  y tiene 31 dia");
                            di = false;
                        }

                        break;
                    case 4:
                        if (dia > 30) {
                            System.out.println("Erroor"
                                    + "\n" + "Este mes es Abril y tiene 30 dia");
                            di = false;
                        }
                        break;
                    case 5:
                        if (dia > 31) {
                            System.out.println("Erroor"
                                    + "\n" + "Este mes es Mayo y tiene 31 dia");
                            di = false;
                        }
                        break;
                    case 6:
                        if (dia > 30) {
                            System.out.println("Erroor"
                                    + "\n" + "Este mes es Junio y tiene 30 dia");
                            di = false;
                        }
                        break;
                    case 7:
                        if (dia > 31) {
                            System.out.println("Erroor"
                                    + "\n" + "Este mes es Julio y tiene 31 dia");
                            di = false;
                        }
                        break;
                    case 8:
                        if (dia > 30) {
                            System.out.println("Erroor"
                                    + "\n" + "Este mes es Agosto y tiene 30 dia");
                            di = false;
                        }
                        break;
                    case 9:
                        if (dia > 30) {
                            System.out.println("Erroor"
                                    + "\n" + "Este mes es Septiembre y tiene 30 dia");
                            di = false;
                        }
                        break;
                    case 10:
                        if (dia > 31) {
                            System.out.println("Erroor"
                                    + "\n" + "Este mes es Octubre y tiene 31 dia");
                            di = false;
                        }
                        break;
                    case 11:
                        if (dia > 30) {
                            System.out.println("Erroor"
                                    + "\n" + "Este mes es Noviembre y tiene 30 dia");
                            di = false;
                        }
                        break;
                    case 12:
                        if (dia > 31) {
                            System.out.println("Erroor"
                                    + "\n" + "Este mes es Diciembre y tiene 31 dia");
                            di = false;
                        }
                        break;
                }

            } while (di == false);

            System.out.println("La fecha que ingreso es:" + dia + "/" + mes + "/" + año);
            System.out.println("La fecha es correcta S/N");
            respuesta = teclado.nextLine().charAt(0);

        } while ((respuesta == 'n') || (respuesta == 'N'));

        int solucion = 0;

        if ((dia == 1) && (mes == 1)) {
            solucion = 1;
        }
        if ((dia == 1) && (mes == 2)) {
            solucion = 2;
        }
        if ((dia == 1) && (mes == 3)) {
            if (r == true) {
                solucion = 3;
            } else {
                solucion = 4;
            }
        }
        if ((dia == 1) && (mes == 4)) {
            solucion = 5;
        }
        if ((dia == 1) && (mes == 5)) {
            solucion = 6;
        }
        if ((dia == 1) && (mes == 6)) {
            solucion = 7;
        }
        if ((dia == 1) && (mes == 6)) {
            solucion = 7;
        }
        if ((dia == 1) && (mes == 7)) {
            solucion = 8;
        }
        if ((dia == 1) && (mes == 8)) {
            solucion = 9;
        }
        if ((dia == 1) && (mes == 9)) {
            solucion = 10;
        }
        if ((dia == 1) && (mes == 10)) {
            solucion = 11;
        }
        if ((dia == 1) && (mes == 11)) {
            solucion = 12;
        }
        if ((dia == 1) && (mes == 12)) {
            solucion = 13;
        }
        if ((dia > 1) && (mes == 1)) {
            solucion = 14;
        }
        if ((dia > 1) && (mes > 1)) {
            solucion = 15;
        }

        switch (solucion) {
            case 1:
                dia = 31;
                mes = 12;
                año = año - 1;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 2:
                dia = 31;
                mes--;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 3:
                dia = 29;
                mes--;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 4:
                dia = 28;
                mes--;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 5:
                dia = 31;
                mes--;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 6:
                dia = 30;
                mes--;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 7:
                dia = 31;
                mes--;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 8:
                dia = 30;
                mes--;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 9:
                dia = 31;
                mes--;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 10:
                dia = 30;
                mes--;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 11:
                dia = 30;
                mes--;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 12:
                dia = 31;
                mes--;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 13:
                dia = 30;
                mes--;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 14:
                dia--;
                mes = 12;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
            case 15:
                dia--;
                mes--;
                año--;
                System.out.println(dia + "/" + mes + "/" + año);
                break;
        }

    }
}
