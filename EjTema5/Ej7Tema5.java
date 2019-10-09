public class Ej7Tema5 {
  public static void main (String [] args) {
  
    System.out.println("Tienes 4 oportunidades para abrir la caja fuerte");
    System.out.println("Pista: el código tiene 4 dígitos");
    
    for (int i = 3; i >= 0; i--) {
      
      int num = Integer.parseInt(System.console().readLine());
      
      if (num == 1234) {
        System.out.println("La caja se ha abierto");
        } else {
          System.out.println("Te quedan " + i + " intentos");
          }
      }
  }
}
