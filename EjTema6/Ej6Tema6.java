/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6tema6;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej6Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int numAleatorio = (int) (Math.random() * 101);
    
    System.out.println("Intenta adivinar el número entre 0 y 100");
    
    for (int i = 4; i > -1; i--) {
      int numIntroducido = s.nextInt();
      
      if (numIntroducido == numAleatorio) {
        System.out.println("Felicidades, has acertado");
        i = -1;
      } else if (numIntroducido > numAleatorio) {
          System.out.println("Lo siento, has fallado, te quedan " + i + " intentos");
          System.out.println("Ese número es mayor que el secreto");
      } else {
          System.out.println("Lo siento, has fallado, te quedan " + i + " intentos");
          System.out.println("Ese número es menor que el secreto");
      }
    }
  }
  
}
