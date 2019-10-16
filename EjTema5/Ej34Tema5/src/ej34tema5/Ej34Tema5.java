/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej34tema5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej34Tema5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce el primer número");
    long n1 = s.nextInt();
    
    System.out.println("Introduce el segundo número");
    long n2 = s.nextInt();
    
    long divisor = 1000000000;
    
    //hace que el divisor comience con las mismas cifras que el número
    while ((n1 / divisor) == 0) {
      divisor = divisor / 10;
    }
    
    int digito = 0;
    boolean centinela = true; //el centinela me permitirá salir del bucle
    int contadorPar = 0;
    int contadorImpar = 0;
    int aux = 1; //me ayudará a sacar el dígito
    
    do {
      //saca los digitos del PRIMER NUMERO en una varible para usarlos debajo
        digito = (int) (n1 / divisor);
        
      while (digito > 9) {
          digito = digito % aux;
          
          if (digito > 9) {
            digito = digito % 10;
          }
      }
      
      //compruebo si el número sacado es par o impar y lo añado a su correspondiente variable
      if ((digito % 2) == 0) {
        contadorPar = contadorPar + digito;
        contadorPar = contadorPar * 10;
      } else {
          contadorImpar = contadorImpar + digito;
          contadorImpar = contadorImpar * 10;
      }
      
      
      //saca los digitos del SEGUNDO NUMERO en una varible para usarlos debajo
        digito = (int) (n2 / divisor);
        
      while (digito > 9) {
          digito = digito % aux;
          
          if (digito > 9) {
            digito = digito % 10;
          }
      }
        
      //compruebo si el número sacado es par o impar y lo añado a su correspondiente variable
      if ((digito % 2) == 0) {
        contadorPar = contadorPar + digito;
        contadorPar = contadorPar * 10;
      } else {
          contadorImpar = contadorImpar + digito;
          contadorImpar = contadorImpar * 10;
      }
      
      aux = aux * 10;
      divisor = divisor / 10;
      if (divisor == 0) {
        centinela = false;
      }
    } while (centinela);
    
    System.out.println("Número con dígitos pares " + (contadorPar / 10));
    System.out.println("Número con dígitos impares " + (contadorImpar / 10));
  }
  
}