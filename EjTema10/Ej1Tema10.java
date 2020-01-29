/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1tema10;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Ej1Tema10 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    ArrayList<String> compañeros = new ArrayList<>();
    
    compañeros.add("Ismael");
    compañeros.add("Diego");
    compañeros.add("Miguel");
    compañeros.add("Victor");
    compañeros.add("Ivan");
    compañeros.add("Luca");
      
    for (String compañero : compañeros) {
      System.out.println(compañero);
    }
  }
  
}
