/*
 * 
 */

package clase17;

/**
 *Date:09/07/2014.
 * @author Johan
 */
public class Clase17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Lista olisLista= new Lista();
        olisLista.Insertar("Efren","356345-4");
         olisLista.Insertar("Joss","34534-5");
          olisLista.Insertar("Navas","45645-8");
            olisLista.Insertar("Johan","45645-8");
              olisLista.Insertar("Adrian","45645-8");
           
           
           if (olisLista.EstaVacia()!= false)
           {
               System.out.println("La lista esta vacia.");
           }
//                 olisLista.Imprimir();
//                 olisLista.EliminarPrimerElemento();
//                 olisLista.Imprimir();
//                 olisLista.EliminarUltino();
//                 olisLista.Imprimir();
                 olisLista.Eliminar();
                 olisLista.Imprimir();
         
    }


  
    
}
