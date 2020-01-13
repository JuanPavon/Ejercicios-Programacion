/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4tema9;

import ej4tema9.Fraccion.Fraccion;

/**
 *
 * @author Usuario
 */
public class Ej4Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fraccion F1 = new Fraccion(6, 12);
        
        F1.invierte();
        F1.simplifica();
        System.out.println(F1.multiplica());
        System.out.println(F1.divide());
    }
    
}
