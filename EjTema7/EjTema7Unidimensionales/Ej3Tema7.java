/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3tema7;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej3Tema7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[10];
    
    for (int i = 0; i < 10; i++) {
      System.out.println("Dime un número");
      num[i] = s.nextInt();
    }
    
    for (int i = 9; i > -1; i--) {
      System.out.println(num[i]);
    }
  }
  
}
