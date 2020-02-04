/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7tema10;
import java.util.ArrayList;
/**
 *
 * @author Juan
 */
public class Ej7Tema10 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      ArrayList<Moneda> a = new ArrayList<>();
      
      Moneda euro = new Moneda();
      a.add(euro);
      
      String ultLado = euro.getLado();
      String ultValor = euro.getValor();
      
      for (int i = 0; i < 6; i++) {
          do {
            euro = new Moneda();
        } while (!((euro.getLado()).equals(ultLado)) && !((euro.getValor()).equals(ultValor)));
          
          System.out.println(euro);
          
          a.add(euro);
          ultLado = euro.getLado();
          ultValor = euro.getValor();
      }
      
  }
  
}
