/*
 * 
 * 
 * *clase 14
 * 20/06/2012.
 */
package clase14;

/**
 *
 * @author Johan
 */
public class Clase14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo= {13,42,11,9,80,1};
        int[] arregloOrdenado;
        clsOrdenamientoSeleccion os= new clsOrdenamientoSeleccion();
        arregloOrdenado = os.ordenS(arreglo, "A");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println(arregloOrdenado[i]);
        }
        
    }
}
