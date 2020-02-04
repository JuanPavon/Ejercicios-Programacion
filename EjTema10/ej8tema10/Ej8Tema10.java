/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8tema10;
import java.util.ArrayList;
/**
 *
 * @author Juan
 */
public class Ej8Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Carta> h = new ArrayList<>();
        
        Carta x = new Carta((int)(Math.random()* 13 + 1));
        h.add(x);
        
        int numero = x.getNumero();
        String palo = x.getPalo();
        
        for(int i = 0; i < 10; i++){
            do {
                x = new Carta((int)(Math.random()* 13 + 1));
            } while ((x.getNumero() == numero) && (x.getPalo().equals(palo))); 
            
            h.add(x);
            numero = x.getNumero();
            palo = x.getPalo();
            
            System.out.println(x);
        }
    }
    
}
