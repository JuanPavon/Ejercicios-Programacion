/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11tema6;

/**
 *
 * @author alumno
 */
public class Ej11Tema6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int nSuspensos = 0;
    int nSuficientes = 0;
    int nBienes = 0;
    int nNotables = 0;
    int nSobresalientes = 0;
    
    for (int i = 0; i < 20; i++) {
    
      int num = (int) (Math.random() * 10 + 1);
      
      switch (num) {
      
        case 1:
        case 2:
        case 3:
        case 4:
          System.out.println("Suspenso");
          nSuspensos++;
          break;
          
        case 5:
          System.out.println("Suficiente");
          nSuficientes++;
          break;
          
        case 6:
          System.out.println("Bien");
          nBienes++;
          break;
          
        case 7:
        case 8:
          System.out.println("Notable");
          nNotables++;
          break;
          
        case 9:
        case 10:
          System.out.println("Sobresaliente");
          nSobresalientes++;
          break;
      }
    }
    
    System.out.println("El número de suspensos es " + nSuspensos);
    System.out.println("El número de suficientes es " + nSuficientes);
    System.out.println("El número de bienes es " + nBienes);
    System.out.println("El número de notables es " + nNotables);
    System.out.println("El número de sobresalientes es " + nSobresalientes);
  }
  
}
