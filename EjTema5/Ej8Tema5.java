public class Ej8Tema5 {
  public static void main (String [] args) {
    
    System.out.println("Introduce un número y te diré su tabla de multiplicar");
    int num = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i < 11; i++) {
      System.out.println(num + " multiplicado por " + i + " es " + (num * i));
      }
  }
}
