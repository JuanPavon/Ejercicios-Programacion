public class Ej3Tema3 {
  public static void main (String [] args) {
    
    System.out.println("Dime las pesetas que quieres convertir a euros");
    
    int Pesetas = Integer.parseInt(System.console().readLine());
    
    System.out.print(Pesetas + " pesetas son " + (Pesetas / 166.386) + "€");
  }
}
