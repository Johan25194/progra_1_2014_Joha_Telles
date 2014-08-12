/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase17;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Lista {

    Scanner teclado = new Scanner(System.in);

    private NodoDeLista raiz;

    public Lista() {
        raiz = null;

    }

    public void Insertar(String dato, String cuentaBancaria) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        nuevo.setCuentaBancaria(cuentaBancaria);

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoDeLista auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();

            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public void Imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos");

        while (recorrido != null) {
            System.out.println(recorrido.getDato() + " , la cuenta bancaria es " + recorrido.getCuentaBancaria());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }

    public boolean EstaVacia() {
        if (raiz == null) {
            return true;
        }
        return false;
    }

    public void Eliminar() {
        NodoDeLista sig = raiz;
        NodoDeLista anterior = null;
        String palabra;
        String temporal;

        char respuesta = 's';
        System.out.println("Desea eliminar un elemento de la lista(si/no)");
        respuesta = teclado.nextLine().charAt(0);

        if ((respuesta == 's') || (respuesta == 'S')) {
            System.out.println("Ingrese la palabra a eliminar");
            palabra = teclado.nextLine();

            while (sig != null) {
                anterior = sig;
                sig = sig.getSiguiente();
                if (sig != null) {
                    
                    if (sig.getDato().equals(palabra)) {
                        
                        anterior.setSiguiente(sig.getSiguiente());
                        raiz=anterior;
                      return;
                    }
             
                }
                anterior=sig;
                sig=sig.getSiguiente();
             
            }

        }
    }

    public void EliminarPrimerElemento() {
        NodoDeLista buscando = raiz;

        raiz = buscando.getSiguiente();

    }

    public void EliminarUltino() {
                
        System.out.println("Listado de todos los elementos de la lista eliminando el ultimo");
   
        
        if (raiz.getSiguiente()==null) {
            raiz=null;
            
        }else
        {
             NodoDeLista anterior=null;
                NodoDeLista sig = raiz;
         while (sig.getSiguiente()!= null) {
                anterior = sig;
                sig = sig.getSiguiente();
           }
               anterior.setSiguiente(null);
                    
        }      
                   
            }
    }


    


