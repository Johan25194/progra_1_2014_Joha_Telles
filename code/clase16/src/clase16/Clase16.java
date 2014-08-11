/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16;


/**
 * Date:27/06/2014
 *
 * @author Johan
 */
public class Clase16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {56, 4, 85, 42};
        int[] arregloOrdenado;
        clsMetodoBorbuja ob = new clsMetodoBorbuja();
        arregloOrdenado = ob.OrdenamientoB(arreglo, "B");
        System.out.println("Ordenamiento burbuja.");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println(arregloOrdenado[i]);

        }
    }
}
