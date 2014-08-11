package listas1;


import java.util.Scanner;
import javax.swing.JOptionPane;
public class Listas1 {
    public static void main(String[] args) {
            Scanner Teclado = new Scanner(System.in);
            claselista tr = new claselista();
               int num;
               String nombre="";
               do {   
                   System.out.println("Ingrese valor");       
                   num=Teclado.nextInt();
                   
              
                   nombre=JOptionPane.showInputDialog("Ingrese nombre.");
                   tr.insertar(num,nombre);
                   
            
        } while (num!=0); 
               tr.Imprimir();
               tr.EliminarPrime();
               tr.Imprimir();                 
    }
    
}
