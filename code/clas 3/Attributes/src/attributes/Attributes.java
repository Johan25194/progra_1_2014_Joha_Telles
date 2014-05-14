/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

import java.util.Scanner;

/**
 *
 * @author JohanAdrian
 */
public class Attributes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean validar = true;
        int opt;
        char continuar;
        double monto;

        //Instancia
        Account oAccount = new Account(); 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Hello");
        while (validar) 
        {
            
            System.out.println("Digite 1 si quiere realizar un deposito y 2 si quiere realizar un retiro");
            opt = Integer.parseInt(teclado.nextLine());
            
            
            if (opt == 1) 
            {
                System.out.println("Digite el monto a depósitar");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.Deposito(monto);
            }

            if (opt == 2) 
            {
                System.out.println("Digite el monto a retirar");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.Retiro(monto);
                
                if (oAccount.isHayError()) 
                {
                    System.out.println("El monto que usted va a retirar no puede ser retirado");
                }
                
            }
                System.out.println("El saldo final  es de:" + oAccount.getSaldoInicial());
                System.out.println("Desea continuar con otra transacción S/N");
                continuar = teclado.nextLine().charAt(0);
                if ((continuar == 's') || (continuar == 'S')) 
                {
                    validar = true;
                }
                if ((continuar == 'N') || (continuar == 'n')) {
                    validar = false;
                }
            System.out.println("good bye");
            

        }

    }

}
