/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5tema7;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej5Tema7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] num = new int[10];
    int maximo = 0;
    int minimo = 1000000;
    
    for (int i = 0; i < num.length; i++) {
      System.out.println("Dime un número");
      num[i] = s.nextInt();
      
      if (num[i] > maximo) {
        maximo = num[i];
      }
      
      if (num[i] < minimo) {
        minimo = num[i];
      }
    }
    
    for (int i = 0; i < num.length; i++) {
      
      if (num[i] == maximo) {
        System.out.println(num[i] + " maximo");
      } else if (num[i] == minimo) {
          System.out.println(num[i] + " minimo"); 
      } else {
          System.out.println(num[i]);
      }
    }
  }
  
}
