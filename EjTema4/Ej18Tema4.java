public class Ej18Tema4 {
  public static void main (String [] args) {
    
    int cifra = 0;
    
    System.out.println("Introduce un número y te diré la primera cifra");
    int num = Integer.parseInt(System.console().readLine());
    
    if (num < 10) {
      cifra = num;
    }
    
    if ((num > 9) && (num < 100)) {
      cifra = num / 10;
    }
    
    if ((num > 99) && (num < 1000)) {
      cifra = num / 100;
    }
    
    if ((num > 999) && (num < 10000)) {
      cifra = num / 1000;
    }
    
    if (num > 9999) {
      cifra = num / 10000;
    }
    
    System.out.println(cifra);
  }
}
