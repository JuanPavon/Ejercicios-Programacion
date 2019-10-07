public class Ej19Tema4 {
  public static void main (String [] args) {
    
    System.out.println("Dime un número y te diré las cifras que tiene");
    int num = Integer.parseInt(System.console().readLine());
  
    if (num < 10) {
      System.out.println("1 cifra");
    }
    
    if ((num > 9) && (num < 100)) {
      System.out.println("2 cifras");
    }
    
    if ((num > 99) && (num < 1000)) {
      System.out.println("3 cifras");
    }
    
    if ((num > 999) && (num < 10000)) {
      System.out.println("4 cifras");
    }
    
    if (num > 9999) {
      System.out.println("5 cifras");
    }
  }
}
