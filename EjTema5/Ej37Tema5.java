/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej37tema5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej37Tema5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Dime un número");
    int num = s.nextInt();
    System.out.println("En el sistema de palotes ese número es:");
    
    int invertido = 0;
    
    while (num > 0) {
      invertido += num % 10;
      invertido *= 10;
      num /= 10;
    }
    
    while (invertido != 0) {
      int digito = invertido % 10;

      for (int i = 0; i < digito; i++) {
        System.out.print("|");
      }
      System.out.print("-");
      invertido /= 10;
    
    }
  }
  
}
