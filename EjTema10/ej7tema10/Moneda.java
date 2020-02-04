/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7tema10;

/**
 *
 * @author Juan
 */
public class Moneda {
    private static String lados[] = {"cara", "cruz"};
    private static String valores[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
    
    private String lado;
    private String valor;

    public Moneda() {
        this.lado = lados[(int) (Math.random() * 2)];
        this.valor = valores[(int) (Math.random() * 8)];
    }

    public String getLado() {
        return lado;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return  this.lado + " - " + this.valor;
    }
    
    
}
