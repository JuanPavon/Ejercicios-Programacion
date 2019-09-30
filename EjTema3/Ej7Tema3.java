public class Ej7Tema3 {
	public static void main (String [] args) {
    
    System.out.println("Introduce la base imponible");
    double x = Double.parseDouble(System.console().readLine());
    
    System.out.println("El total de su factura es " + (x * 1.21));
  }
}
