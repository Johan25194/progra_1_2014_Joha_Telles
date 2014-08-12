/*
Date:09/07/2014
 */

package clase17;

/**
 *
 * @author Johan
 */
public class NodoDeLista {
    private String dato;
    private NodoDeLista siguiente;
   private  String CuentaBancaria;
    
    public NodoDeLista()
    {
   
    dato="";
    siguiente=null;
    }

    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoDeLista getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDeLista siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the CuentaBancaria
     */
    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    /**
     * @param CuentaBancaria the CuentaBancaria to set
     */
    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

 
    
    
}
