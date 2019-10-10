public class Ej14Tema5 {
  public static void main (String [] args) {
    
    System.out.println("Introduce la base");
    int base = Integer.parseInt(System.console().readLine());
    int aux = base;
    
    System.out.println("Introduce el exponente");
    int exponente = Integer.parseInt(System.console().readLine());
    
    if (exponente == 0) {
      System.out.println("1");
      } else {
    for(int i = 1; i < exponente; i++) {
      base = base * aux;
      }
    }
    
    System.out.println(base);
  }
}
