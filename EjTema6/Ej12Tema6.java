/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Ej12Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    for(int i = 0; i < 10; i++) {
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
    }
  }
  
}
