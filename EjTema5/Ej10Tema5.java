public class Ej10Tema5 {
  public static void main (String [] args) {
  
    System.out.println("Voy a calcular la media de los números que introduzcas");
    System.out.println("Cuando hayas terminado introduce un número negativo");
    
    int contador = -1;
    int acumulador = 0;
    int num = 0;
    
    do {
      acumulador = acumulador + num;
      contador++;
      num = Integer.parseInt(System.console().readLine());
      } while (num >= 0);
      
    System.out.println("La media es " + ((double)acumulador / contador));
  }
}
