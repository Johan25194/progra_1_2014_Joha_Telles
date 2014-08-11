/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

/**
 *Date:04/06/2014
 * @author JohanAdrian
 */
public class StringUp {

    private String hilera;

    public String subString(int begin, int end) throws Exception {
        String retorno = "";
        if (end < begin) {
            throw new Exception("Error el final no puede ser menor al inicio");
        }

        if (getHilera().length() < 0) {
            throw new Exception("La hilera debe contener caracteres");
        }

        for (int i = begin-1 ; i < end; i++) {
            retorno += getHilera().charAt(i);
        }

        return retorno;

    }

    public String toUpperCase() {
        String retorno = "";

        String mayuscula = "ABCDEFGHIJKLMNOPQKRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqkrstuvwxyz";

        int index =0;

        for (int i = 0; i < getHilera().length(); i++) {
            if (Character.isLowerCase(getHilera().charAt(i))) {

                index = minusculas.indexOf(getHilera().charAt(i));
                retorno+=mayuscula.charAt(index);
            } else {
                retorno+= getHilera().charAt(i);
            }
        }
        return retorno;
    }
    
    public String valuOf()
    {
        
        return null;
    
    }
    

    /**
     * @return the hilera
     */
    public String getHilera() {
        return hilera;
    }

    /**
     * @param hilera the hilera to set
     */
    public void setHilera(String hilera) {
        this.hilera = hilera;
        
    }
}
