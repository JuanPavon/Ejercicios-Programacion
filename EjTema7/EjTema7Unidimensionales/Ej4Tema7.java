/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4tema7;

/**
 *
 * @author alumno
 */
public class Ej4Tema7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random() * 101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];
    }
    
    for (int i = 0; i < 20; i++) {
      System.out.printf("%-10d %-10d %-10d\n", numero[i], cuadrado[i], cubo[i]);
    }
  }
  
}
