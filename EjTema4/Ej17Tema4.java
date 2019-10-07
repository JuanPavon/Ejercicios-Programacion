public class Ej17Tema4 {
  public static void main (String [] args) {
    System.out.println("Dime un número y te diré la última cifra del mismo");
    int num = Integer.parseInt(System.console().readLine());
    
    System.out.println(num % 10);
  }
}
