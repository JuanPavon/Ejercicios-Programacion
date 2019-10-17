/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej36tema5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej36Tema5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    
    System.out.println("Introduce un número y te diré si es capicúo");
    long num = s.nextLong();
    long aux = num;
    
    long invertido = 0;
    
    while (aux > 0) {
      invertido += aux % 10;
      invertido *= 10;
      aux /= 10;
    }
    
    System.out.println(invertido);
    if ((invertido / 10) == num) {
      System.out.println("Es capicuo");
    } else {
        System.out.println("No es capicuo");
      }
  }
  
}
