/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6tema7;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej6Tema7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] num1 = new int[15];
    int[] num2 = new int[15];
    
    for (int i = 0; i < num1.length; i++) {
      System.out.println("Dime un número");
      num1[i] = s.nextInt();
      
      if (i == 14) {
        num2[0] = num1[i];
      } else {
        num2[i + 1] = num1[i];
      }
    }
    
    for (int i = 0; i < num1.length; i++) {
      System.out.println(num2[i]);
    }
    
    //forma de Diego
    
    /*int[] num = new int[15];
    int aux = 0;
    
    for (int i = 0; i < num.length; i++) {
      System.out.println("Dime un número");
      aux = s.nextInt();
      
      if (i == 14) {
        num[0] = aux;
      } else {
        num[i + 1] = aux;
      }
    }
    
    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }*/
  }
  
}
