/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3tema6;

/**
 *
 * @author alumno
 */
public class Ej3Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int palo = (int) (Math.random() * 4 + 1);
    int num = (int) (Math.random() * 10 + 1);
    String paloLetra = null;
    
    switch (palo) {
    
      case 1:
        paloLetra = "Bastos";
        break;
        
      case 2:
        paloLetra = "Espadas";
        break;
        
      case 3:
        paloLetra = "Oros";
        break;
        
      case 4:
        paloLetra = "Copas";
        break;
        
      default:
        break;
    }
    
    System.out.print("La carta es el ");
    
    switch (num) {
      case 1:
        System.out.print("As");
        break;
      case 8:
        System.out.print("Sota");
        break;
      case 9:
        System.out.print("Caballo");
        break;
      case 10:
        System.out.print("Rey");
        break;
      default:
        System.out.print(num);
        break;
    }
    
    System.out.print(" de " + paloLetra);
  }
  
}
