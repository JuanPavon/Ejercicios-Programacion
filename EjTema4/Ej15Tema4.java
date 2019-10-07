public class Ej15Tema4 {
  public static void main (String [] args) {
    System.out.println("Introduce el carácter de la pirámide");
    String c = System.console().readLine();
    
    System.out.println("¿Para qué lado quieres el vértice?");
    System.out.println("a) Arriba b) Derecha c) Abajo d) Izquierda");
    String vertice = System.console().readLine();
    
    if (vertice.equals("a")) {
        System.out.println("  " + c);
        System.out.println(" " + c + c + c);
        System.out.println(c + c + c + c + c);
      }
    
    if (vertice.equals("b")) {
         System.out.println(c);
        System.out.println(c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println(c + " " + c);
        System.out.println(c);
      
      }
      
    if (vertice.equals("c")) {
        System.out.println(c + c + c + c + c);
        System.out.println(" " + c + c + c);
        System.out.println("  " + c);
      
      }
      
    if (vertice.equals("d")) {
        System.out.println("    " + c);
        System.out.println("  " + c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println("  " + c + " " + c);
        System.out.println("    " + c);
      
      }
  }
}
