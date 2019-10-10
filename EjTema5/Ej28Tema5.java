public class Ej28Tema5 {
  public static void main (String [] args) {
  
    System.out.println("Dime un número y te diré su factorial");
    int num = Integer.parseInt(System.console().readLine());
    int contador = 2;
    int factorial = 1;
    do {
      factorial = factorial * contador;
      contador++;
      } while (contador < (num + 1));
    
    System.out.println("El factorial del número es " + factorial);
  }
}
