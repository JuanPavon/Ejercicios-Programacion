/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13tema6;

/**
 *
 * @author alumno
 */
public class Ej13Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int dado1 = 0;
    int dado2 = 0;
    
    do {
      dado1 = (int) (Math.random() * 6 + 1);
      dado2 = (int) (Math.random() * 6 + 1);
      
      System.out.println(dado1 + " " + dado2);
    } while (dado1 != dado2);
  }
  
}
