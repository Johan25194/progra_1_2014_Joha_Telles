/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intentosdeareglos;

import com.sun.javafx.collections.ElementObservableListDecorator;

/**
 *
 * @author JohanAdrian
 */
public class clssNotas {

    private double elemento[] = new double[10];

    public void AgregarElementos(double pnota) {
        for (int i = 0; i < elemento.length; i++) {
            if (elemento[i] == 0) {
                elemento[i] = pnota;
                break;
            }
        }
    }

    public String PromedioGeneral() {
        int suma = 0, promedio = 0, promedio1 = 0;
        int suma1 = 0;
        String retorno = "";

        for (int i = 0; i < elemento.length; i++) {
            if (i < 5) {
                suma += elemento[i];

            } else {
                suma1 += elemento[i];

            }
        }
        System.out.println(suma);
        System.out.println(suma1);
        promedio += suma / 5;
        promedio1 += suma1 / 5;

        if (promedio > promedio1) {
            retorno = "El grupo A tiene el mayor promedio es de:" + "\n" + promedio;
        } else {
            retorno = "El grupo B tiene el mayor promedio es de:" + "\n" + promedio1;
        }
        return retorno;

    }

}
