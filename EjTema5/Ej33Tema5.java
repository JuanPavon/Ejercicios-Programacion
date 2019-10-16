/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej33tema5;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej33Tema5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce la altura de la U");
    int altura = s.nextInt();
    
    for (int i = 1; i < altura; i++) {
      System.out.print("*");
      
      for (int ii = 1; ii < (altura - 1); ii++) {
        System.out.print(" ");
      }
      
      System.out.print("*");
      System.out.println();
    }
    System.out.print(" ");
    
    for (int iii = 1; iii < (altura - 1); iii++) {
        System.out.print("*");
      }
    System.out.println();
  }
  
}
