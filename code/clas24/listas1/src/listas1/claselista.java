package listas1;
public class claselista {
    private nodolista raiz;
    
    public void insertar(int user, String name) {
        nodolista nuevo = new nodolista();
        nuevo.setNums(user);
        nuevo.setNombre(name);
        if(getRaiz() == null) {
            nuevo.setSiguiente(null);
            setRaiz(nuevo);
        }else
        { 
            nodolista auxiliar = getRaiz();
            while (auxiliar.getSiguiente()!=null) {   
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        
        }
    }
    
    public void Imprimir()
    {   nodolista recorre = getRaiz();
        System.out.println("Estos son los valores de la lista.");
        while (recorre!=null) {            
            System.out.println(recorre.getNums()+" "+ recorre.getNombre());
            recorre=recorre.getSiguiente();
        }
   
    }
    public  void EliminarPrime()
    {
        while (raiz!=null) {            
           raiz=raiz.getSiguiente();
        }
        if (raiz==null) {
            System.out.println("Lista esta vacia");
        }
    
    }

    public nodolista getRaiz() {
        return raiz;
    }

    public void setRaiz(nodolista raiz) {
        this.raiz = raiz;
    }
    
}
