/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10tema6;

/**
 *
 * @author alumno
 */
public class Ej10Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    for (int i = 1; i < 11; i++) {
    
        System.out.print(i + ".");
        
        for (int ii = (int) (Math.random() * 40 + 1); ii < 41; ii++) {
         
          int num = (int) (Math.random() * 6 + 1);
         
          switch (num) {
         
            case 1:
             System.out.print(" *");
             break;
             
            case 2:
             System.out.print(" -");
             break;
             
            case 3:
             System.out.print(" =");
             break;
             
            case 4:
             System.out.print(" .");
             break;
             
            case 5:
             System.out.print(" |");
             break;
             
            case 6:
             System.out.print(" @");
             break;
         }
       }
        
       System.out.println();
    }
  }
  
}
