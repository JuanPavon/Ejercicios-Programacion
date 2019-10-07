public class Ej24Tema4 {
  public static void main (String [] args) {
  
    System.out.println("Introduzca el cargo del empleado:");
    System.out.println("1. Junior");
    System.out.println("2. Senior");
    System.out.println("3. Jefe");
    
    int cargo = Integer.parseInt(System.console().readLine());
    
    System.out.println("¿Días de viaje?");
    int diasViaje = Integer.parseInt(System.console().readLine());

    System.out.println("¿Estado civil?");
    System.out.println("1. Soltero");
    System.out.println("2. Casado");
    int estadoCivil = Integer.parseInt(System.console().readLine());

    double sueldoBase = 0;

    switch (cargo) {
      
      case 1: //  Junior
        sueldoBase = 950;
        break;
        
      case 2: // Senior
        sueldoBase = 1200;
        break;
        
      case 3: // Jefe
        sueldoBase = 1600;
        break;
        
      default:
        System.out.println("Error");
    }

    double sueldoViajes = diasViaje * 30;

    double sueldoBruto = sueldoBase + sueldoViajes;

    double irpf = 0;

    if (estadoCivil == 1) { // Soltero
      irpf = 25;
    } else if (estadoCivil == 2) { // Casado
      irpf = 20;
    } else {
      System.out.println("Error");
    }
    
    double IRPF = (sueldoBruto * irpf) / 100;
    
    double total = sueldoBruto - IRPF;

    System.out.println("");
    System.out.println("Sueldo base " + sueldoBase);
    System.out.println("Dinero viajes " + sueldoViajes);
    System.out.println("Sueldo bruto " + sueldoBruto);
    System.out.println("IRPF " + IRPF);
    System.out.println("Total " + total);
  }
}
