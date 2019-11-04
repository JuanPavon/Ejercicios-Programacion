/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17tema6;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej17Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce el ancho");
    int ancho = s.nextInt();
    int anchoPez = (int)(Math.random() * (ancho - 2));
    System.out.println(anchoPez);
    
    System.out.println("Introduce el alto");
    int alto = s.nextInt();
    int altoPez = (int)(Math.random() * (alto - 2) + 1);
    System.out.println(altoPez);
    
    for (int i = 0; i < alto; i++) {
      
      if ((i == 0) || (i == (alto - 1))) {
        for (int ii = 0; ii < ancho; ii++) {
          System.out.print("* ");
        }
      } else {
          System.out.print("* ");
          
          for (int iii = 0; iii < (ancho - 2); iii++) {
            
            if ((i == altoPez) && (iii == anchoPez)) {
              System.out.print("& ");
            } else {
                System.out.print("  ");
            } 
          }
          System.out.print("*");
      }
      System.out.println();
    }
  }
  
}
