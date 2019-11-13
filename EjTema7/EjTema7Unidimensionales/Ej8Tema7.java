/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8tema7;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej8Tema7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String[] mes = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio",
      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
    
    int[] temperatura = new int[12];
    
    for (int i = 0; i < temperatura.length; i++) {
      System.out.println("Introduce la temperatura de " + mes[i]);
      temperatura[i] = s.nextInt();
    }
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%-10s |", mes [i]);
      
      for (int ii = 0; ii < temperatura[i]; ii++) {
        System.out.print("▄");
      }
      System.out.print(" " + temperatura[i]);
      System.out.println();
    }
    
  }
  
}
