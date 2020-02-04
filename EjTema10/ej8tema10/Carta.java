/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8tema10;

/**
 *
 * @author Juan
 */
public class Carta {
    private static String palos[] = {"espadas", "copas", "bastos", "oros"};
    int numero;
    String palo;
    
    public Carta(int numero) {
        this.numero = numero;
        this.palo = palos[(int)(Math.random() * 4)];
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
    
    
}
