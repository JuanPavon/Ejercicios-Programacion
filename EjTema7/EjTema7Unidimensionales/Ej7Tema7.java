/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej7Tema7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[100];
    
    for(int i = 0; i < num.length; i++) {
      num[i] = (int)(Math.random() * 21);
      System.out.print(num[i] + " ");
    }
    System.out.println();
    System.out.println("Introduce el número que quieras cambiar");
    int numACambiar = s.nextInt();
    
    System.out.println("Introduce el número por el que lo quieres cambiar");
    int numCambiado = s.nextInt();
    
    for (int i = 0; i < num.length; i++) {
      if (num[i] == numACambiar) {
        num[i] = numCambiado;
        System.out.print("'" + num[i] + "' ");
      } else {
        System.out.print(num[i] + " ");
      }
    }
  }
  
}
