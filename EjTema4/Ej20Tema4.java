public class Ej20Tema4 {
  public static void main (String [] args) {
    
    int capicua = 0;
    
    System.out.println("Introduce un número y te diré si es capicúo o no");
    int num = Integer.parseInt(System.console().readLine());
    
    if (num < 10) {
      capicua = 1;
    }
    
    if ((num >= 10) && (num < 100)) {
      if ((num / 10) == (num % 10)) {
        capicua = 1;
      }
    }

    if ((num >= 100) && (num < 1000)) {
      if ((num / 100) == (num % 10)) {
        capicua = 1;
      }
    }

    if ((num >= 1000) && (num < 10000)) {
      if (((num / 1000) == (num % 10)) && (((num / 100) % 10)== ((num / 10) % 10))) {
        capicua = 1;
      }
    }
    
    if (num >= 10000) {
      if (((num / 10000) == (num % 10) ) && ((((num / 1000) % 10)) == ((num / 10) % 10))) {
        capicua = 1;
      }
    }
    
    if (capicua == 1) {
      System.out.println("Es capicúo");
    } else {
      System.out.println("No es capicúa");
    }
  }
}
