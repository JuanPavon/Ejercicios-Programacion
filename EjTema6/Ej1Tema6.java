/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1tema6;

/**
 *
 * @author alumno
 */
public class Ej1Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int suma = 0;
    int num = 0;
    for (int i = 0; i < 3; i++) {
      num = (int) (Math.random() * 6 + 1);
      System.out.println("Dado " + num);
      suma += num;
    }
    
    System.out.println("La suma es " + suma);
  }
  
}
