/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5tema6;

/**
 *
 * @author alumno
 */
public class Ej5Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int media = 0;
    int max = 0;
    int min = 200;
    
    for (int i = 0; i < 50; i++) {
      int num = (int)(Math.random() * 100 + 100);
      System.out.print(num + " ");
      media += num;
      
      if (num > max) {
        max = num;
      }
      
      if (num < min) {
        min = num;
      }
    }
    System.out.println();
    System.out.println("La media es " + (media / 50));
    System.out.println("El numero maximo es " + max);
    System.out.println("El numero minimo es " + min);
  }
  
}
