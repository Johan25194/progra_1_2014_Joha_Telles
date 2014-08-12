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
public class clssVector {
    private int elemento[]= new int[8];
    
    public void AgregarVectores(int pnumero)
    {
        for (int i = 0; i < elemento.length; i++) {
            if(elemento[i]==0)
            {
            elemento[i]=pnumero;
            break;
            }
        }
    }
    
    public String SumaDeVectores()
    {
        String acumulado="La suma total del vector es:"+"\n";
        int retorno=0;
        for (int i = 0; i < elemento.length; i++) {
            retorno+=elemento[i];
        }
        acumulado+=retorno;
        return acumulado;
    
    }
    public String AnalizarVector()
    {
        int cont = 0,cont1 = 0;
        String retorno="";
        for (int i = 0; i <elemento.length; i++) {
            if((elemento[i]>36)&&(elemento[i]<50))
            {
            cont++;
            }
            else if (elemento[i]>50)
            {
                cont1++;
            }   
        }
        retorno="La cantidad de elementos mayores que 36 son: "+"\n"+cont+"\n"+
                "La cantidad de elementos mayores que 50 son: "+"\n"+cont1;
        return retorno;
    }
}
