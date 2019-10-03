public class Ej10Tema4 {
  public static void main (String [] args) {
    System.out.println("Este programa te dice cual es tu horóscopo");
    
    System.out.println("Introduce el mes de tu nacimiento");
    int mes = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el día de tu nacimiento");
    int dia = Integer.parseInt(System.console().readLine());
    
    switch (mes) {
      case 1: 
        if (21 < dia) {
          System.out.println("Tu signo es acuario");
          } else {
              System.out.println("Tu signo es capricornio");
            }
        break;
        
      case 2: 
        if (19 < dia) {
          System.out.println("Tu signo es piscis");
          } else {
              System.out.println("Tu signo es acuario");
            }
        break;
        
      case 3: 
        if (21 < dia) {
          System.out.println("Tu signo es aries");
          } else {
              System.out.println("Tu signo es piscis");
            }
        break;
        
      case 4: 
        if (21 < dia) {
          System.out.println("Tu signo es tauro");
          } else {
              System.out.println("Tu signo es aries");
            }
        break;
        
      case 5: 
        if (21 < dia) {
          System.out.println("Tu signo es geminis");
          } else {
              System.out.println("Tu signo es tauro");
            }
        break;
        
      case 6: 
        if (21 < dia) {
          System.out.println("Tu signo es cancer");
          } else {
              System.out.println("Tu signo es geminis");
            }
        break;
        
      case 7: 
        if (21 < dia) {
          System.out.println("Tu signo es leo");
          } else {
              System.out.println("Tu signo es cancer");
            }
        break;
        
      case 8: 
        if (21 < dia) {
          System.out.println("Tu signo es virgo");
          } else {
              System.out.println("Tu signo es leo");
            }
        break;
        
      case 9: 
        if (21 < dia) {
          System.out.println("Tu signo es libra");
          } else {
              System.out.println("Tu signo es virgo");
            }
        break;
        
      case 10: 
        if (21 < dia) {
          System.out.println("Tu signo es escorpio");
          } else {
              System.out.println("Tu signo es libra");
            }
        break;
        
      case 11: 
        if (21 < dia) {
          System.out.println("Tu signo es sagitario");
          } else {
              System.out.println("Tu signo es escorpio");
            }
        break;
        
      case 12: 
        if (21 < dia) {
          System.out.println("Tu signo es capricornio");
          } else {
              System.out.println("Tu signo es sagitario");
            }
        break;
        
      default:
        System.out.println("El dato introducido no es correcto");
        break;
      }
  }
}
