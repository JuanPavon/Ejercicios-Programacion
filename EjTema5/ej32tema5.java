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
public class ej32tema5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce un número entero");
    long num = Integer.parseInt(s.nextLine());
    int divisor = 10;
    boolean centinela = true;
    int contador = 0;
    int digito = 0;
    
    do {
      do { //este primer do saca los digitos en una varible para usarlos debajo
        digito = (int) (num % divisor);
        
        if (digito > 9) {
          digito = digito / (divisor / 10);
        }
      } while (digito > 9);
      
      if ((digito % 2) == 0) {
        contador = contador + digito;
      }
      
      divisor = divisor * 10;
      if (num / divisor == 0) {
        centinela = false;
      }
    } while (centinela);
    
    System.out.println("La suma de los digitos pares es " + contador);
    }
  }
  

