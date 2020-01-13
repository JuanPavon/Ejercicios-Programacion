/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4tema9.Fraccion;

/**
 *
 * @author Usuario
 */
public class Fraccion {
    int numerador;
    int denominador;
    
    //constructor
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void invierte() {
        int aux = denominador;
        denominador = numerador;
        numerador = aux;
    }
    
    public void simplifica() {
        numerador = (int) (numerador/2);
        denominador = (int) (denominador/2);
    }
    
    public int multiplica() {
        return (numerador * denominador);
    }
    
    public int divide() {
        return (numerador / denominador);
    }
}
