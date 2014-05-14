/*
 * Name:Practica1
 * Information: this is class frist
 * Date:09/052014
 *copyright


 */

package apppractica1;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author JohanAdrian
 */
public class AppPractica1 {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancia
        
        Scanner teclado = new Scanner(System.in);
        // Declaracion de variables
        /*
        int N;
        double A;
        char c =' ';
        
        //This is the number one practice
        out.println("Hello my brother"+"\n");
        out.print("Ingrese un valor"+"\n");
        N=Integer.parseInt(teclado.nextLine());
        out.print("Ingrese otro valor"+"\n");
        A=Double.parseDouble(teclado.nextLine());
        out.println("N="+N + "\n" + "A="+A);
        out.println("La suma es de:" + (N + A)+ "\n");
        out.println("La resta es de:" +(A-N) + "\n");
        out.println("El valor numerico de la letra es de:" + Character.getNumericValue(c));*/
        //_________________________________________________________________________________
               //Tis is the number two practice
        
        int x,y,r;
        double n,m = 0;
        int opt;
        
        out.print("Elija una:"
               + "\n" + "1.Raiz "
               + "\n" + "2.Potencia" 
               + "\n" + "3.multiplicacion"
               + "\n" + "4.Salir" );
        opt = Integer.parseInt(teclado.nextLine());
        switch(opt){
            case 1:
                do{
        out.print("Ingrese el numero que desesa optener la raiz");
                x =Integer.parseInt(teclado.nextLine());
                out.println("Ingrese un numero positivo y mayor que cero");
                }while((x==0)||(x<0));
                if(x>0){
                n =Math.sqrt(x);
                out.println("La raiz es de: " + n);
                }
            break;
            case 2:
                out.print("Ingrese el numero");
                y=Integer.parseInt(teclado.nextLine());
                out.print("Ingrese la potencia");
                x = Integer.parseInt(teclado.nextLine());
                if(x>0){
                r = (int) Math.pow(y, x);
                out.println("La potencia es:"+r);
                }
                else{
                m =Math.pow(y, x);
                out.println("La potencia es:" + m );
                }
            break;
            case 3:
                out.print("Ingrese el primer numero");
                m = Double.parseDouble(teclado.nextLine());
                out.print("ingrese el otro");
                n = Double.parseDouble(teclado.nextLine());
                out.println("El resultado de multiplicacion de "+(m*n));
                break;
             
        //______________________________________________________________________
        //This is the number three practice
        /*int n;
        out.print("Ingrese un numero entero");
        n = Integer.parseInt(teclado.nextLine());
        out.println("El valor ingresado ha sido encrementado, ahora tiene un valor de: "+"  "+ (n+77)+"\n" );
        out.println("El valor anterior ha sido descrementado, opteniendo un valor de: "+((n+77)-3)+ "\n") ;
        out.println("El valor duplicado es:  "+ (((n+77)-3)*2) + "\n7");
                */
        //________________________________________________________________________
        //This is the number four practice
        /*int b,c,a,d,j;
        out.print("Ingrese cuatro valores"+"\n");
        b=Integer.parseInt(teclado.nextLine());
        c=Integer.parseInt(teclado.nextLine());
        a=Integer.parseInt(teclado.nextLine());
        d=Integer.parseInt(teclado.nextLine());
        out.println("Los valores son:"+"\n"+"b="+b+"\n"+"c="+c+"\n"+"a="+a+"\n"+"d="+d+"\n" );
        j=b;
        out.println("Los valores son:"+"\n"+"b="+c+"\n"+"c="+a+"\n"+"a="+d+"\n"+"d="+j+"\n");
        */
        //______________________________________________________________________
        //This is the number five practice
        /*int a,r,s;
        int respuesta = 1;
        out.println("Hello;"+"\n"+"This calculated, if it is even or odd.");
         do {
        out.print("Ingrese un valor:)"+"\n");
        a= Integer.parseInt(teclado.nextLine());
        r=a%2;
        if(r==0)
        {
        out.println("¡¡¡The number is even!!!!");
        }
        else
        {out.println("¡¡¡¡¡The number is odd!!!!");
        }
        
        out.print("Ingrese uno para continuar, por lo contrario digite cualquier tecla. "+"\n");
        s =Integer.parseInt(teclado.nextLine());
         } while (respuesta==s);
         out.println("¡¡¡¡¡¡Good bye!!!!!!!");
                */
        //______________________________________________________________________
        //This is the number six practce
        /*int b;
        out.println("This is calculated,if is positive or negative"+"\n");
        out.print("Ingrese un numero"+"\n");
        b= Integer.parseInt(teclado.nextLine());
        if(b>=0)
        {
        out.println("The number is positive");
        }
        else
        {
        out.println("The number is negative");
        }
        */
        //______________________________________________________________________
        //This is hte number seven pactice
      /*  int c,r;
        
        out.print("Ingrese un valor"+"\n");
        c = Integer.parseInt(teclado.nextLine());
        if(c>=0)
        {
        out.println("The number is positive"+"\n");
        }
        else
        {
        out.println("The number is negative"+"\n");
        }
        
         r=c%2;
        if(r==0)
        {
        out.println("¡¡¡The number is even!!!!"+"\n");
        }
        else
        {out.println("¡¡¡¡¡The number is odd!!!!"+"\n");
        }
        
        if((c%5)==0){
        out.println("the number is multiplo for five.");
        }
        else{
      if ( c%10==0);
      {out.println("The number is multiplo for ten.");
      }
        }
        if(c>100){
        out.println("the number is mayor que 100.");
        }
        else{
        out.println("The number is nenor que 100.");
        }
              */
        }
        
       
    }
}
   
    

