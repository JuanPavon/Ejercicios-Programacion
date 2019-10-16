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
public class Ej30Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Scanner s = new Scanner(System.in);
      
      System.out.println("Introduce el día de la semana");
      String dia1 = s.nextLine();
      int nDia1 = 0;
      
      switch (dia1) {
      
      case "Lunes":
        nDia1 = 1;
        break;
        
      case "Martes":
        nDia1 = 2;
        break;
        
      case "Miércoles":
      case "Miercoles":
        nDia1 = 3;
        break;
        
      case "Jueves":
        nDia1 = 4;
        break;
        
      case "Viernes":
        nDia1 = 5;
        break;
        
      case "Sábado":
      case "Sabado":
        nDia1 = 6;
        break;
        
      case "Domingo":
        nDia1 = 7;
        break;
        
      default:
        System.out.println("No es correcto");
      }
      
      System.out.println("Introduce la primera hora");
      int hora1 = Integer.parseInt(s.nextLine());
      
      System.out.println("Introduce el segundo dia");
      String dia2 = s.nextLine();
      int nDia2 = 0;
      
      switch (dia2) {
      
      case "Lunes":
        nDia2 = 1;
        break;
        
      case "Martes":
        nDia2 = 2;
        break;
        
      case "Miércoles":
      case "Miercoles":
        nDia2 = 3;
        break;
        
      case "Jueves":
        nDia2 = 4;
        break;
        
      case "Viernes":
        nDia2 = 5;
        break;
        
      case "Sábado":
      case "Sabado":
        nDia2 = 6;
        break;
        
      case "Domingo":
        nDia2 = 7;
        break;
        
      default:
        System.out.println("No es correcto");
      }
      
      System.out.println("Introduce la segunda hora");
      int hora2 = Integer.parseInt(s.nextLine());
      
      if (hora1 > hora2) {
        int aux = hora1;
        hora1 = hora2;
        hora2 = aux;
      }
      
      System.out.println("Quedan "+ (((nDia2 - nDia1) * 24) + (hora2 - hora1)) + " horas");
    }
    
}
