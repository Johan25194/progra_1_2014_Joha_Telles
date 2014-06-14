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
public class ejerccio2 {

    //declaracion de areglos
    private int vector1[] = new int[4];
    private int vector2[] = new int[4];
    private int vector3[] = new int[4];

    public void AgregarVector1(int pnumero) {
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] == 0) {
                vector1[i] = pnumero;
                break;
            }
        }
    }

    public void AgregarDeVector2(int pnumero1) {
        for (int i = 0; i < vector1.length; i++) {
            if (vector2[i] == 0) {
                vector2[i] = pnumero1;
                break;
            }
        }
    }

    public String Imprimir() {
        String imprimir = "";
        int suma = 0;
        for (int i = 0; i < vector1.length; i++) {
            suma = vector1[i] + vector2[i];

            for (int r = 0; r < vector3.length; r++) {
                if (vector3[r] == 0) {
                    vector3[r] = suma;
                    break;
                }
            }
        }
        suma=0;
        imprimir+="Los resultados del vector3 son:"+"\n";
        for (int i = 0; i < vector3.length; i++) {
            imprimir += vector3[i] + "\n";
            suma+=vector3[i];
        }
        imprimir+="La suma tola del sector3 es de:"+"\n"+suma;
        return imprimir;
    }
}
