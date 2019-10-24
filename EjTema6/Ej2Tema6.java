/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2tema6;

/**
 *
 * @author alumno
 */
public class Ej2Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int palo = (int) (Math.random() * 4 + 1);
    int num = (int) (Math.random() * 13 + 1);
    String paloLetra = null;
    
    switch (palo) {
    
      case 1:
        paloLetra = "Picas";
        break;
        
      case 2:
        paloLetra = "Corazones";
        break;
        
      case 3:
        paloLetra = "Diamantes";
        break;
        
      case 4:
        paloLetra = "Treboles";
        break;
        
      default:
        break;
    }
    
    System.out.print("La carta es ");
    
    switch (num) {
      case 1:
        System.out.print("A");
        break;
      case 11:
        System.out.print("J");
        break;
      case 12:
        System.out.print("Q");
        break;
      case 13:
        System.out.print("K");
        break;
      default:
        System.out.print(num);
        break;
    }
    
    System.out.print(" de " + paloLetra);
  }
  
}
