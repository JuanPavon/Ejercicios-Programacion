/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15tema6;

/**
 *
 * @author alumno
 */
public class Ej15Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    for (int i = (int)(Math.random() * 7); i < 7; i++) {
      for (int ii = 0; ii < 4; ii++) {
        int num = (int) (Math.random() * 7 + 1);
        
        switch (num) {
          
          case 1:
            System.out.print("do ");
            break;
            
          case 2:
            System.out.print("re ");
            break;
            
          case 3:
            System.out.print("mi ");
            break;
            
          case 4:
            System.out.print("fa ");
            break;
            
          case 5:
            System.out.print("sol ");
            break;
            
          case 6:
            System.out.print("la ");
            break;
            
          case 7:
            System.out.print("si ");
            break;
        }      
      }
      System.out.print("| ");
    }
  }
  
}
