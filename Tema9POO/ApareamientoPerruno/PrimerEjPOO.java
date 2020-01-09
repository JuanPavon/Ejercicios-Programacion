/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerejpoo;

import primerejpoo.perro.Perro;

/**
 *
 * @author Usuario
 */
public class PrimerEjPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro gooffy = new Perro("Gooffy", 1234, "Pastor Aleman", "Macho");
        Perro pluto = new Perro("Pluto", 4321, "Labrador", "Macho");
        
        gooffy.ladra();
        gooffy.saluda();
        pluto.saluda();
               
        //Perro cria = gooffy.apareaCon(pluto, gooffy);
        if(gooffy.apareaCon(pluto, gooffy)) {
            Perro cria = new Perro ("Lina", 2314, "Caniche", "Hembra");
            cria.saluda();
        } else {
            System.out.println("No hay apareamiento");
        }
        
        
    }
    
}
