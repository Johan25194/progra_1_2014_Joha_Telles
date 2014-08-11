package listas1;
public class nodolista {
    private int nums;
    private String nombre;
    private nodolista siguiente;
    
    public nodolista() {
        this.nums = 0;
        this.siguiente = null;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public nodolista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodolista siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
            
}
