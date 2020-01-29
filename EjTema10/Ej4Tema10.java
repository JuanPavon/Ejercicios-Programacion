/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4tema10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Ej4Tema10 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ArrayList<String> a = new ArrayList<>();

    System.out.println("Introduce 10 palabras: ");
    for (int i = 0; i < 10; i++) {
      a.add(s.nextLine());
    }

    Collections.sort(a);

    System.out.println("Lista ordenada alfabéticamente:\n" + a);
  
  }
  
}
