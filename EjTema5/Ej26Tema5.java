public class Ej26Tema5 {
  public static void main (String [] args) {
  
    System.out.println("Dime un número");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("Dime un dígito");
    int digito = Integer.parseInt(System.console().readLine());
    
    int x = 1;
    
    for (int i = -1; i < digito; i++) {
      x = x * 10;
      }
    
    num = num % x;
    x = x / 10;
    
    System.out.println("Ese dígito corresponde al número " + (num / x));
  }
}
