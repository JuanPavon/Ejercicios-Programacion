public class Ej25Tema4 {
  public static void main (String [] args) {
  
    System.out.println("¿Altura de la bandera?");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("¿Anchura de la bandera?");
    int anchura = Integer.parseInt(System.console().readLine());
    
    double precio = (anchura * altura) / 100;
    
    System.out.println("¿Quiere escudo?");
    System.out.println("si / no");
    String escudo = System.console().readLine();
    
    double precioEscudo = 0;
    
    if (escudo.equals("si")) {
        precioEscudo = 2.5;
      }
      
    System.out.println("");
    System.out.println("Precio bandera " + precio);
    System.out.println("Escudo " + precioEscudo);
    System.out.println("Gastos de envío 3.25");
    System.out.println("Total " + (precio + precioEscudo + 3.25));
  }
}
