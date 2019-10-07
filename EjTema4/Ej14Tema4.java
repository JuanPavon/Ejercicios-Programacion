public class Ej14Tema4 {
  public static void main (String [] args){
    
    System.out.println("Dime un numero");
    int x = Integer.parseInt(System.console().readLine());
    
    if ((x % 2) == 0) {
      System.out.println("El numero es par");
      } else {
          System.out.println("El numero es impar");
        }
    
    if ((x % 5) == 0) {
      System.out.println("Y es divisible entre 5");
      } else {
          System.out.println("Y no es divisible entre 5");
        }
  }
}
