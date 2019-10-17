/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej38tema5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej38Tema5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce la altura de la pirámide");
    int altura = s.nextInt();
    int aux = altura;
    
    if (((altura % 2) == 0) && (altura < 3))  {
      System.out.println("El número introducido no es correcto");
    } else {
        
        //pinta la parte de arriba
        for (int i = 0; i < (altura / 2); i++) {
        
          for(int ii = 0; ii < i; ii++) {
            System.out.print(" ");
          }
          
          for (int iii = aux; 0 < iii; iii--) {
            System.out.print("*");
          }
          System.out.println();
          aux -= 2;
          int aux2 = i;
        }
    
        //pinta el centro
        for (int x = 0; x < (altura / 2); x++) {
          System.out.print(" ");
        }
        System.out.println("*");
        
        //pinta la parte de abajo
        aux += 2;
        for (int i = (altura / 2); 0 < i; i--) {
        
          for(int ii = 1; ii < i; ii++) {
            System.out.print(" ");
          }
          
          for (int iii = aux; 0 < iii; iii--) {
            System.out.print("*");
          }
          System.out.println();
          aux += 2;
        }
    
    }
    
    
  }
  
}
