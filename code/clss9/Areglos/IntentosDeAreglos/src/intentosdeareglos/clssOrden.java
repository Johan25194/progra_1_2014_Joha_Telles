/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intentosdeareglos;

/**
 *
 * @author JohanAdrian
 */
public class clssOrden {

    private int elemento[] = new int[10];

    public void AgregaraElementos(int pnumero) {
        for (int i = 0; i < elemento.length; i++) {
            if (elemento[i] == 0) {
                elemento[i] = pnumero;
                break;
            }
        }
    }

    public String VerificarOrden() {
        String retorno = "";
        int cont = 0;  
        for (int i = 0; i < elemento.length-1; i++) {
            if (elemento[i]<=elemento[i+1]) {
                cont++;
            }
        }
            if (cont==elemento.length -1  ) {
                retorno="Es ordenado";
            }
            else
            {
            retorno="Desordenado";
            }
        

        return retorno;

    }
}
