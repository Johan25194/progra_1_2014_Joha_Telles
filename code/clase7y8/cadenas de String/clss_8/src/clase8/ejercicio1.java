/*


 */
package clase8;

/**
 *Date:04/06/2014
 * @author JohanAdrian
 */
public class ejercicio1 {
//Declaracion de atributos

    private String cadena;
    private String buscar;
//Parametro inicializado en nada

    public ejercicio1() {
        this.cadena = "";
        this.buscar = "";
    }
// Metodo get del texto que ingresa

    public String getCadena() {
        return cadena;
    }
//Metodo set del texto.

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
//Metodo que cambia el texto de atras para adelante

    public String Alrevez() {
        String retorno = "";
        for (int i = getCadena().length() - 1; i >= 0; i--) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    //Metodo que calcula el palíndromo
    public String palíndromo() {
        String retorno = getCadena();
        for (int i = getCadena().length() - 2; i >= 0; i--) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }
//Metodo quebusca palabras

    public String marque() {
        String palabra = "";
        String retorno = "";
        for (int i = 0; i < getCadena().length(); i++) {

            if ((getCadena().charAt(i) == ' ') || (i > getCadena().length()-3 )) {
                if (palabra.equals(getBuscar())) {
                    palabra = "-" + palabra + " ";
                } else {
                    retorno += palabra;
                    palabra = " ";
                }
                retorno += palabra;
                palabra = "";
            } else {
                palabra += getCadena().charAt(i);
            }
        }
        return retorno;
    }

    //Metodo que calcula la cantida de veces que se repite una palabra
    public String ocurrencia() {
        String palabra = "";
        int retorno = 0;
        for (int i = 0; i < getCadena().length(); i++) {

            if ((getCadena().charAt(i) == ' ') || (i > getCadena().length() - 2)) {
                if (palabra.equals(getBuscar())) {
                    retorno++;
                    palabra = "";
                } else {
                    palabra = "";
                }

            } else {
                palabra += getCadena().charAt(i);

            }
        }
        return ("La cantida de ocurrencias son de:" + '\n' + retorno);
    }

    /**
     * @return the buscar Metodo get de la palabra buscar in gresada por el
     * usuario
     */
    public String getBuscar() {
        return buscar;
    }

    /**
     * @param buscar the buscar to set Metodo set de la palabra
     */
    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

}
