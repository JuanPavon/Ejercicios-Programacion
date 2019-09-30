
public class Ej2Tema3 {
  public static void main (String [] args) {
  
    System.out.println("Dime los euros que deseas convertir a pesetas");
    
    int Euros = Integer.parseInt(System.console().readLine());
    
    System.out.print(Euros + "€ son " + (Euros * 166.386) + " pesetas");
  }
}
