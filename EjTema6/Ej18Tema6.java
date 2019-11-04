/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej18tema6;

/**
 *
 * @author alumno
 */
public class Ej18Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int [] num = new int [3];
    
    do {
      
      for (int i = 0; i < 3; i++) {
        num [i] = (int)(Math.random() * 6);
      }
    } while ((num [0] == num [1]) || (num [1] == num [2]) || (num [0] == num [2]));
    
    for (int i = 0; i < 3; i++) {
      
      switch (num[i]) {
        
        case 0:
          System.out.println("Rojo");
          break;
        
        case 1:
          System.out.println("Azul");
          break;
          
        case 2:
          System.out.println("Verde");
          break;
          
        case 3:
          System.out.println("Amarillo");
          break;
          
        case 4:
          System.out.println("Violeta");
          break;
          
        case 5:
          System.out.println("Naranja");
          break;
      }
    }
  }
  
}
