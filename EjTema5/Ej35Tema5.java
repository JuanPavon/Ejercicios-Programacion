/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej35tema5;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ej35Tema5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Intoduzca un número impar para la altura de la X");
    int altura = s.nextInt();
    
    if (((altura % 2) == 0) && (altura < 3))  {
      System.out.println("El número introducido no es correcto");
    }
    
    System.out.print("*");
    for (int i = 0; i < (altura - 2); i++) {
      System.out.print(" ");
    }
    System.out.print("*");
    System.out.println();
    
    int aux2 = 1;
    int aux4 = 4;
    
    for (int ii = 1; ii < (altura / 2); ii++) {
      
      int aux1 = 0;
      
      while (aux1 < aux2) {
        System.out.print(" ");
        aux1++;
      }
      aux2++;
      
      System.out.print("*");
      
      int aux3 = 0;
      
      while (aux3 < (altura - aux4)) {
        System.out.print(" ");
        aux3++;
      }
      aux4 += 2;
      
      System.out.print("*");
      
      System.out.println();
      
    }
  }
  
}
