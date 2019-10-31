/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16tema6;

/**
 *
 * @author alumno
 */
public class Ej16Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int [] figura = new int [3];
    
    for (int i = 0; i < 3; i++) {
      figura [i] = (int) (Math.random() * 5 + 1);
      
      switch (figura[i]) {
        
        case 1:
          System.out.print("corazón ");
          break;
          
        case 2:
          System.out.print("diamante ");
          break;
          
        case 3:
          System.out.print("herradura ");
          break;
          
        case 4:
          System.out.print("campana ");
          break;
          
        case 5:
          System.out.print("limón ");
          break;
      }
    }
    
    System.out.println();
    
    if ((figura[0] == figura[1]) && (figura[0] == figura[2])) {
      System.out.println("Has ganado 10 monedas");
    } else if ((figura[0] == figura[1]) || (figura[0] == figura[2]) || (figura [1] == figura[2])) {
        System.out.println("Te devuelvo la moneda");
    } else {
        System.out.println("Has perdido");
    }
  }
  
}
