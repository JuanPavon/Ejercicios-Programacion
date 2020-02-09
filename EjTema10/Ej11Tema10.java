/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11tema10;
import java.util.Scanner;
import java.util.HashMap;
/**
 *
 * @author Juan
 */
public class Ej11Tema10 {

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
        d.put("caramelo", "candy");
        d.put("manzana", "apple");
        d.put("andamio", "scaffolding");
        d.put("botella", "bottle");
        d.put("sangre", "blood");
        d.put("libro", "book");
        
        int aciertos = 0;
        int fallos = 0;
        
        //meto las claves en un array
        String[] claves = d.keySet().toArray(new String[10]);
        
        //creo y relleno un array con 5 numeros aleatorios
        int[] aleatorios = new int[5];
        for(int i = 0; i < 5; i++){
            aleatorios[i] = (int)(Math.random()* 10);
        }
        
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Traduce la palabra " + claves[aleatorios[i]]);
            String palabra = s.nextLine();
            
            if(d.get(claves[aleatorios[i]]).equals(palabra)) {
                aciertos++;
                System.out.println("Correcto!");
            } else {
                fallos++;
                System.out.println("Incorrecto");
            }
        }
        
        System.out.println("Numero total de aciertos " + aciertos);
        System.out.println("Numero total de fallos " + fallos);
    }
    
}
