/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej39tema5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej39Tema5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce un número");
    int num = s.nextInt();
    
    
    
    for (int i = 1; i < (num + 1); i++) {
      int factorial = 1;
      
      for (int ii = 1; ii < (i + 1); ii++) {
        factorial *= ii; 
      }
      
    System.out.println(i + "! es igual a " + factorial);
    }
  }
  
}
