public class Ej15Tema5 {
  public static void main (String [] args) {
    
    System.out.println("Introduce la base");
    int base = Integer.parseInt(System.console().readLine());
    int aux = base;
    
    System.out.println("Introduce el exponente");
    int exponente = Integer.parseInt(System.console().readLine());
    
    for(int i = 1; i < (exponente + 1); i++) {
      System.out.println(aux + "^" + i + " da como resultado " + base);
      base = base * aux;
      }
  }
}
