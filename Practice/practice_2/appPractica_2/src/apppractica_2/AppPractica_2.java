/*
 * DATA:18/05/2014.
 */
package apppractica_2;

import java.util.Scanner;

/**
 *
 * @author JohanAdrian
 */
public class AppPractica_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         *Ejercicio 1.
         */
        int a;
        int cont = 0;
        Scanner teclado = new Scanner(System.in);/*
         System.out.println("Ingrese un numero");
         a = Integer.parseInt(teclado.nextLine());

         do {
         System.out.print("*" + "\n");
         cont = cont + 1;

         } while (cont <= a);

         /*
         *Ejercicio 2.
         */
        /* int n;
         int y;

         System.out.println("Ingrese un numero");
         n = Integer.parseInt(teclado.nextLine());
         System.out.println("Ingrese el numero para remplazar ");
         y = Integer.parseInt(teclado.nextLine());

         for (int i = 1; i <= n; i++) {
         if ((i % y) == 0) {
         System.out.println("*");
         } else {
         System.out.println(i);
         }

         }
         */
        /*
         //Ejercicion 3
         double inicial;
         double incremento;
         double terninal;
        
         System.out.println("Ingrese un numero de inicio");
         inicial= Double.parseDouble(teclado.nextLine());
         System.out.println("Ingrese un valor final");
         terninal=Double.parseDouble(teclado.nextLine());
         System.out.println("Ingrese un valor para incrementar el valor inicial");
         incremento=Double.parseDouble(teclado.nextLine());
        
         double suma=inicial;
        
         for (double i = suma; i <= terninal; i=i+incremento) {
           
         System.out.println(i);
            
         }
         */

//Ejwrcicio 4 padovan

        /*  int n1;
         int A = 1, B = 1, C = 1;

         System.out.println("Ingrese un numero entero positivo");
         n1 = Integer.parseInt(teclado.nextLine());
         if (n1 <= 3) {
         System.out.print(A + "," + A + "," + A + ",");
         A = B + A;
         B = C + B;
         C=  A + C;
         System.out.print(A + "," + B + ","+C +",");
         } else {
         System.out.print(A + "," + A + "," + A + ",");
         A = B + A;
         B = C + B;
         C=  A + C;
         System.out.print(A + "," + B + ","+ C+ ",");
            
         while((C<n1)||(A<n1)||(B<n1)){              
         A = B + A;
         if(A<=n1)
         {
         System.out.print(A + ",");
         }
         B = C + B;
         if(B <= n1)
         {
         System.out.print(B + ",");
         }
         C =  A + C;
         if(C <= n1)
         {
         System.out.print(C + ",");
         }
                
         }

         }*/
        //Ejercicio 5 potencias
        /* int n2;
         int n3,r; 
         float R=0;
         float acum=1;
        
         System.out.println("Ingrese un numero");
         n2=Integer.parseInt(teclado.nextLine());
         System.out.println("Ingrese una potencia");
         n3=Integer.parseInt(teclado.nextLine());
        
         if(n3>0)
         {
         r=1;
         for (int i = 0; i <n3; i++) {
         r =n2*r;    
         }
      
         System.out.println(r);
         }
         else
         {
        
         n3=-1*n3;
         for (int i = 0; i <n3; i++) {
         acum = n2*acum;
         }
         R=( 1/ acum);
         System.out.print(R);
         }
         */
        //Ejercicio 6
       /* 
         int m;
         System.out.println("Ingrese un valor para iniciar");
         m=Integer.parseInt(teclado.nextLine());
        
         for (int i = 11111; i < 100000; i++) {
            
         System.out.println(i);
         }
         */
        /*
         //Ejercicio 7
         float n;
         int imp =0;
         int par = 0;
         float r = 0;
         float t;
         System.out.println("ingrese un valor");
         n=Integer.parseInt(teclado.nextLine());
         t= (float) 1.0;
         for (float i = 1; i <=n; i++) {
         r =i;
          
         do {  
         r= r/2;
                
         } while (r>t);
           
         
         if(r==t)
         {
         par++;
         t=(float) (t*1.0);
         t=(float) (t+1.0);
         }
         else
         {
         imp++;
         }
           
         }
         System.out.println("La cantidad de pares son:"+par+"\n"
         +"La cantidad de impares son:"+imp);
        
         */
        //Ejercicio 8 tabla de multiplicar
        /*
         char opt;

         cont = 1;
         char respueta = 's';
         int n;
         int tabla;

         do {
         System.out.println("Ingrese una opción:"
         + "\n" + "1.for."
         + "\n" + "2.Do while."
         + "\n" + "3.While."
         + "\n" + "4.Salir."
         );
         opt = (teclado.nextLine()).charAt(0);
         switch (opt) {
         case '1': {
         System.out.println("Ingrese el numero de una tabla de multiplicar");
         n = Integer.parseInt(teclado.nextLine());
         for (int i = 1; i <= 15; i++) {
         tabla = n * i;
         System.out.println(n + "*" + i + "=" + tabla); }

         }
         break;
         case '2': {
         System.out.println("Ingrese el numero de una tabla de multiplicar");
         n = Integer.parseInt(teclado.nextLine());
         do {
         tabla = n * cont;
         System.out.println(n + "*" + cont + "=" + tabla);
         cont++;

         } while (cont <= 15);
         }
         break;
         case '3':{
         System.out.println("Ingrese el numero de una tabla de multiplicar");
         n = Integer.parseInt(teclado.nextLine());
         while(cont<=15){
                    
         tabla = n * cont;
         System.out.println(n + "*" + cont + "=" + tabla);
         cont++;
         }        
         }
         break;
         }
         System.out.println("Desea continuar si/No");
         respueta = teclado.nextLine().charAt(0);
         } while ((respueta == 's') || (respueta == 'S'));
         */
        //ejercicio 9.
       /* int n;
         int s = 0;
         int cont2=0;
         int cont1=10;
        
         while (cont1>=1) { 
         System.out.println("Ingrese la nota");
         n=Integer.parseInt(teclado.nextLine());
         s=s+n;
         cont1--;
         cont2++;   
         }
         System.out.println("El promedio es:"+ s/cont2);
         */
        //Ejercicio 10;
       /* int n;
         int p;
         int S = 0;
         int cont2 = 0;
         cont =10;
         do {
         System.out.println("Ingrese las notas");
         n = Integer.parseInt(teclado.nextLine());
         cont2++;
         S = S + n;
         cont--;
         } while ((cont >= 1) && (n>= 1));
         p = S / cont2;
         System.out.println("Su promedio es de: "+ p);
         */
        //Ejercicio 11 dolares
/*
         int cont1 = 10;
         int s = 0;
        
         while (cont1>=1) {
         s=1*560;
         System.out.print(s+";");
         cont1--;  
         }
         System.out.print("="+560*10);
         */
        //Ejercicio 12
        /*
         double q = 1000;
         int cont1 = 0;
         while(cont1<=12)
         {
         q =(q *0.02)+q;
         cont1++;
         }
         System.out.println("En un año tendra:  "  +  q +  "Dolares,");
         */
        //Ejercicio 13
        int h = 00;
        int m = 00;
        int s = 00;

        System.out.println(h + ":" + m + ":" + s);
        do {

            while (s < 59) {
                s++;
                System.out.println(h + ":" + m + ":" + s);
            }
            if (s == 59) {
                s = 0;
                m++;

                System.out.println(h + ":" + m + ":" + s);

            }

            if (m == 59) {
                h++;
                if (h > 23) {

                    h = 23;
                    while (s < 59) {
                        s = s + 1;
                        System.out.println(h + ":" + m + ":" + s);
                    }
                } else {
                    m = 0;
                    System.out.println(h + ":" + m + ":" + s);
                }

            }

        } while ((m <= 58) && (s <= 58));

        //Ejercicio 14;
        /* double q = 1000;
 
         cont = 0;
        
         do { 
         q = (q *0.02)+q;
         cont++;
         } while (q<=1500);
         System.out.println("Transcurriran"+"  "+cont+"  "+" mese");
         */
        //Ejercicio 15
        /*int cont1=1;
         int cont2 = 1;
         int I;
         String tabla;

         do {
            
         do{
         I =(2*cont1)-1;
                
         tabla = (I+",");
         System.out.print(tabla);
         cont1++;
         }while(cont1<=cont2);
            
            
         System.out.println("\n");
         cont2++;
         cont1=1;
         }while (I< 15);
         */
    }
}
