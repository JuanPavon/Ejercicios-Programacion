public class Ej18Tema5 {
  public static void main (String [] args) {
    
    System.out.println("Dime un número");
    int num1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Dime otro número");
    int num2 = Integer.parseInt(System.console().readLine());
    
    if (num1 == num2) {
      System.out.println("Esos números son iguales");
      } else if (num2 < num1) {
        int aux = num1;
        num1 = num2;
        num2 = aux;
        } 
        
    while (num1 < num2) {
      num1 = num1 + 7;
      if(num1 < num2) { 
        System.out.println(num1);
          } 
        }

  }
}
