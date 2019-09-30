
public class Ej1Tema3 {
  public static void main (String [] args) {
  
    System.out.println("Dime un numero");
    
    int x = Integer.parseInt(System.console().readLine());
     
    System.out.println("Dime otro numero");
    
    int y = Integer.parseInt(System.console().readLine());
    
    System.out.println("El resultado de su multiplicacion es " + (x * y));
  }
}
