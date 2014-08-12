/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clss_8;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import sun.awt.SunHints;

/**
 *
 * @author JohanAdrian
 */
public class clssejercicio2 {
    //Declaracion de atributos.
    private String cadenaDetexto;
    private String palabraAbuscar;
    //Metodo constructor inicializado en nada.
    public clssejercicio2()
    {
    this.cadenaDetexto="";
    this.palabraAbuscar="";
    }
    
    //Metodo que devuelve el ultimo caracter.
   public String caharAt()
   {
       char index = 0;
       index = getCadenaDetexto().charAt(getCadenaDetexto().length()-1);
        return ("La letra final es: " + index +'\n'+ "El valor de length es de: " + getCadenaDetexto().length() );
   }
   //Este metodo compara texto
   public String compareTo( )
   {
       String retorno= "";
       int r;
       r = getCadenaDetexto().compareTo(getPalabraAbuscar());
       if (r>0) {
           retorno=getCadenaDetexto() + "  es mayor que "+getPalabraAbuscar();
       }
       else if(r<0)
       {
       retorno=getCadenaDetexto() + "  es menor que  "+getPalabraAbuscar();
       }
       else{
       retorno=getCadenaDetexto() + "  es igual que  "+getPalabraAbuscar();
       }
        return retorno;
   
   }
   //Este medoto sudstrae una parte del texto
   public String substring(int pn,int pn1)
   {
       String retorno="" ;
       retorno =  getCadenaDetexto().substring(pn, pn1);
        return retorno;
   }
   //Metoto que cambia de minuscula a mayuscula.
   public String toUppercase()
   {
       String retorno="";
       retorno=getCadenaDetexto().toUpperCase()+'\n'+getPalabraAbuscar().toUpperCase();
        return retorno;
   }

    /**
     *
     */
   //Metodo que devuelve una letra
    public String value(int pn)
   {
       String retorno="";
       retorno = getCadenaDetexto().valueOf(pn);
   return retorno;
   }
   
    /*
        Falta el metodo indexof
            */
        
        
       
   
    
    /**
     * @return the cadenaDetexto
     */
    public String getCadenaDetexto() {
        return cadenaDetexto;
    }

    /**
     * @param cadenaDetexto the cadenaDetexto to set
     */
    public void setCadenaDetexto(String cadenaDetexto) {
        this.cadenaDetexto = cadenaDetexto;
    }

    /**
     * @return the palabraAbuscar
     */
    public String getPalabraAbuscar() {
        return palabraAbuscar;
    }

    /**
     * @param palabraAbuscar the palabraAbuscar to set
     */
    public void setPalabraAbuscar(String palabraAbuscar) {
        this.palabraAbuscar = palabraAbuscar;
    }
/*Conversiones 
int valor = Integer.parseInt(String)// Pasar de String a int 
String resultado = Integer.toString(12345) // Pasar de int a String 
String resultado = Double.toString(12345.25)// Pasar de double a String 
String resultado = Float.toString(12345.70)// Pasar de float a String 
String hilera = Character.toString(caracter)//Pasar de caracter a hilera 
String numero = String.valueOf(1234); 
String fecha = String.valueOf(new Date());
*/

    
    
}
