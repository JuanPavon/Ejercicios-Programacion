/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10tema9;

/**
 *
 * @author Usuario
 */
public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }
    
    public void come (int x) {
         this.peso += x - 1;
    }
    
    public void come (Ameba Julia) {
        this.peso += Julia.peso - 1;
        Julia.peso = 0;
    }
    
    @Override
    public String toString() {
        return "Soy una ameba y peso " + this.peso + " microgramos";
    }
}
