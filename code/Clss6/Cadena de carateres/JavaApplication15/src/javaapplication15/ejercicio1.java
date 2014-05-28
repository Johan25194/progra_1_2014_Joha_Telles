/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication15;

/**
 *
 * @author JohanAdrian
 */
public class ejercicio1 {
    
    private String email;
    
    public  ejercicio1(String pEmail)
    {
    this.email = pEmail;
    }
    
    public String validarCorreo()
    {
    String mensaje= "No contiene @ ";
    
        for (int i = 0; i <email.length(); i++) {
            if(email.charAt(i)=='@')
            {
            mensaje="El correo si contiene @";
            }
            
        }
    return mensaje;
    }

 
    
}
