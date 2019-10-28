/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9tema6;

/**
 *
 * @author alumno
 */
public class Ej9Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int contador = 0;
    int num = 0;
    
    do {
      
      num = (int) (Math.random() * 50);
      num *= 2;
      contador++;
      
    } while (num != 24);
    
    System.out.println("Se han generado " + contador + " números");
  }
  
}
