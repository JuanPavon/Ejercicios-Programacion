/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class ej31tema5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca la altura de la L");
    int altura = Integer.parseInt(s.nextLine());
    
    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }
    
    for (int ii = 0; ii < ((altura / 2) + 1); ii++) {
      System.out.print("*");
    }
  }
  
}
