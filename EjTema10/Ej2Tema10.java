/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2tema10;
import java.util.ArrayList;
/**
 *
 * @author Juan
 */
public class Ej2Tema10 {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int tamaño = (int)(Math.random() * 11 + 10);
    ArrayList<Integer> n = new ArrayList<>();
    
    for(int i = 0; i < tamaño; i++) {
      n.add((int)(Math.random() * 101));
    }
    
    int suma = 0;
    for (Integer num : n) {
      suma += num;
    }
    
    int resta = 0;
    for (Integer num : n) {
      resta -= num;
    }
    
    int media = suma / tamaño;
    
    System.out.println("La suma es " + suma);
    System.out.println("La resta es " + resta);
    System.out.println("La media es " + media);
  }
  
}
