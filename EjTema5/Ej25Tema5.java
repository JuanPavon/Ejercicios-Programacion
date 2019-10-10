public class Ej25Tema5 {
  public static void main (String [] args) {
    
    System.out.println("Introduzca un número ");
    int num = Integer.parseInt(System.console().readLine());
    int vuelta = 0;
    
    while (num > 0) {
      vuelta = (vuelta * 10) + (num % 10);
      num /= 10;
    }
    
    System.out.println("El número volteado es " + vuelta);
  }
}
