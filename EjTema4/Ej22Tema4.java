public class Ej22Tema4 {
  public static void main (String [] args) {
  
    System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
    String dia = System.console().readLine();

    int diaNum = 0;

    switch(dia) {
      
      case "lunes":
        diaNum = 0;
        break;
        
      case "martes":
        diaNum = 1;
        break;
        
      case "miércoles":
        diaNum = 2;
        break;
        
      case "jueves":
        diaNum = 3;
        break;
        
      case "viernes":
        diaNum = 4;
        break;
        
      default:
        System.out.println("Error");
    }
    
    System.out.println("Introduzca la hora y luego los minutos");
    
    System.out.println("Hora: ");
    int h = Integer.parseInt(System.console().readLine());
    
    System.out.println("Minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int min = (4 * 24 * 60) + (15 * 60); 
    //la variable corresponde a los minutos que hay hasta llegar al viernes a las 15:00
    
    int min1 = (diaNum * 24 * 60) + (h * 60) + minutos; 
    //la variable corresponde a los minutos actuales
    
    System.out.print("Faltan " + (min - min1) + " minutos para el fin de semana.");
  }
}
