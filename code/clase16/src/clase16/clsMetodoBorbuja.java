/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16;

/**
 * Date:27/06/2014.
 *
 * @author Johan.
 */
public class clsMetodoBorbuja {

    public int[] OrdenamientoB(int[] arreglo, String ordenamiento) {
        int indice;
        int indice2;
        int auxiliar;

        if (ordenamiento.equals("A")) {
            for (indice = 0; indice < arreglo.length - 1; indice++) {
                for (indice2 = 0; indice2 < (((arreglo.length) - indice) - 1); indice2++) {


                    if (arreglo[indice2 + 1] < arreglo[indice2]) {
                        auxiliar = arreglo[indice2 + 1];
                        arreglo[indice2 + 1] = arreglo[indice2];
                        arreglo[indice2] = auxiliar;
                    }
                }

            }
            System.out.println("Ordenamiento de forma Asendente.");
        } else {
            for (indice = 0; indice < arreglo.length - 1; indice++) {
                for (indice2 = 0; indice2 < (((arreglo.length) - indice) - 1); indice2++) {


                    if (arreglo[indice2 + 1] > arreglo[indice2]) {
                        auxiliar = arreglo[indice2 + 1];
                        arreglo[indice2 + 1] = arreglo[indice2];
                        arreglo[indice2] = auxiliar;
                    }

                }

            }
            System.out.println("Ordenamiendon de forma desendente.");
        }
        return arreglo;


    }
}
