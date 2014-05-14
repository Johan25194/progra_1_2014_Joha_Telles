/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

/**
 *
 * @author JohanAdrian
 */
public class Account {

    //Declaracion de atributos......Las variable van con minuscula y despues con mayuscula
    private double saldoInicial;
    private boolean hayError;

    //Parametro
    public Account() {
        saldoInicial = 0;
        hayError = false;

    }
    /*
     Este metodo sirve para aumentar la cuenta de un usuario
     */

    //Los nombre de los metodos van con mayusculas
    public void Deposito(double monto) {
        setSaldoInicial(getSaldoInicial() + monto);//Esto es lo mismo que saldoInicial=saldoInicial+monto
    }

    public void Retiro(double monto) {
        if (getSaldoInicial() >= monto) {
            setSaldoInicial(getSaldoInicial() - monto);
        } else {
            setHayError(true);
        }
    }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }

}
