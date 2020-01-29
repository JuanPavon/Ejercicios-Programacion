/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3tema10;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Ej3Tema10 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ArrayList<Integer> n = new ArrayList<>();
    int[] array = new int[10];
    
    //almaceno los numeros en un array que ordenare despues
    System.out.println("Dime 10 numeros");
    for(int i = 0; i < 10; i++) {
      array[i] = s.nextInt();
    }
    
    for(int i = 0; i < 10; i++){
      int minimo = Integer.MAX_VALUE;
      
      //compruebo el valor minimo del array y lo introduzco en el ArrayList
      for(int ii = 0; ii < 10; ii++){
        if(array[ii] < minimo){
          minimo = array[ii];
        }
      }
      
      n.add(minimo);
      
      //quito ese minimo
      for(int ii = 0; ii < 10; ii++){
        if(array[ii] == minimo){
          array[ii] = Integer.MAX_VALUE;
        }
      }
    }
    
    for (int num : n) {
      System.out.println(num);
    }
  }
  
}
