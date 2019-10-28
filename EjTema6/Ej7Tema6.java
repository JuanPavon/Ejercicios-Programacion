/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7tema6;

/**
 *
 * @author alumno
 */
public class Ej7Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    for (int i = 1; i < 16; i++) {
      
      System.out.print(i + ".");
      
      if (i == 15) {
        int num = (int) (Math.random() * 3 + 1);

          switch (num) {

            case 1:
              System.out.print("| X");
              break;

            case 2:
              System.out.print("| 1");
              break;

            case 3:
              System.out.print("| 2");
              break;
          }
      } else {
        
        for (int ii = 0; ii < 3; ii++) {
          int num = (int) (Math.random() * 3 + 1);

          switch (num) {

            case 1:
              System.out.print("| X");
              break;

            case 2:
              System.out.print("| 1");
              break;

            case 3:
              System.out.print("| 2");
              break;

          }
        }
      }
      
      System.out.println();
    }
  }
  
}
