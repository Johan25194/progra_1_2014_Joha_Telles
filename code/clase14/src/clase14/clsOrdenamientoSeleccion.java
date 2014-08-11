/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase14;

/**
 * Date: 20/06/2014.
 * @author johan
 */
public class clsOrdenamientoSeleccion {

    public int[] ordenS(int arreglo[], String ordenamiento) {
        int indice = 0;
        int indice2 = 1;
        int menor = 0;
        int posicion = 0;

        //Este for revela la posicion de los valores en el arreglo
        for (indice = 0; indice < arreglo.length - 1; indice++) {
            menor = arreglo[indice];

//Este for recorre la cantidad de elementos
            for (indice2 = indice2; indice2 < arreglo.length; indice2++) {

                if (arreglo[indice2] < menor) {
                    arreglo[indice] = arreglo[indice2];
                    arreglo[indice2] = menor;
                    menor = arreglo[indice];
                    posicion = indice2;
                }

            }
      //con esto el indice toma una posicion mas ariba
            indice2 = posicion;
        }

        return arreglo;

    }
}
