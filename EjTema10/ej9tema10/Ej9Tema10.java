/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9tema10;
import java.util.ArrayList;
/**
 *
 * @author Juan
 */
public class Ej9Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Carta> bastos = new ArrayList<>();
        ArrayList<Carta> espadas = new ArrayList<>();
        ArrayList<Carta> oros = new ArrayList<>();
        ArrayList<Carta> copas = new ArrayList<>();
        
        Carta x = new Carta((int)(Math.random()* 13 + 1));
        
        int numero = x.getNumero();
        String palo = x.getPalo();
        
        for(int i = 0; i < 10; i++){
            do {
                x = new Carta((int)(Math.random()* 13 + 1));
            } while ((x.getNumero() == numero) && (x.getPalo().equals(palo))); 
            
            if(x.palo.equals("bastos")){
                bastos.add(x);
            }
            
            if(x.palo.equals("espadas")){
                espadas.add(x);
            }
            
            if(x.palo.equals("oros")){
                oros.add(x);
            }
            
            if(x.palo.equals("copas")){
                copas.add(x);
            }
            
            numero = x.getNumero();
            palo = x.getPalo();
            
        }
        
        for (Carta copa : copas) {
              System.out.println(copa);  
            }
            
            for (Carta espada : espadas) {
              System.out.println(espada);  
            }
            
            for (Carta oro : oros) {
              System.out.println(oro);  
            }
            
            for (Carta basto : bastos) {
              System.out.println(basto); 
    
            }
    }
    
}
