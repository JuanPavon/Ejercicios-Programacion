/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6tema9;

/**
 *
 * @author Usuario
 */
public class Ej6Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo (1, 20, 40);
        Tiempo t2 = new Tiempo (2, 40, 50);
        
        System.out.println(t1.suma(t1, t2));
        System.out.println(t1.resta(t1, t2));
    }
    
}
