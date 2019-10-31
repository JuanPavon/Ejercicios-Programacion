/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14tema6;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej14Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int num = (int) (Math.random() * 101);
    int minimo = 0;
    int maximo = 100;
    
    for (int i = 0; i < 5; i++) {
      System.out.println("¿Es este el número que estás pensando? " + num);
      String respuesta1 = s.nextLine();
      
      if (respuesta1.equals("Si")) {
        System.out.print("¡He acertado!");
        i = 6;
      } else {
          System.out.println("¿Es mayor o menor?");
          String respuesta2 = s.nextLine();

          if (respuesta2.equals("mayor")) {
            minimo = num;
            num = (int) (Math.random() * (maximo - minimo) + minimo);
            } else {
                maximo = num;
                num = (int) (Math.random() * maximo + 1);
          }
      }
    }
  }
  
}
