/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10tema10;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Ej10Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> d = new HashMap<>();
        
        d.put("boligrafo", "pen");
        d.put("mano", "hand");
        d.put("ornitorrinco", "platypus");
        d.put("comprar", "buy");
        d.put("galleta", "cookie");
        d.put("dulce", "candy");
        d.put("manzana", "apple");
        d.put("andamio", "scaffolding");
        d.put("botella", "bottle");
        d.put("sangre", "blood");
        d.put("libro", "book");
        
        boolean centinela = true;
        
        do {
            System.out.println("Introduce una palabra en español");
            String palabra = s.nextLine();
            
            if(d.containsKey(palabra)){
                System.out.println(palabra + " en ingles es " + d.get(palabra));
            } else if (palabra.equals("x")){
                centinela = false;
            } else {
                System.out.println("Lo siento esa palabra no está en el diccionario");
            }
        } while (centinela);
    }
    
}
