public class Ej13Tema4 {
  public static void main (String [] args) {
    
    System.out.println("Voy a ordenar de menor a mayor los tres numeros que me digas");
    System.out.println("¿Numero 1?");
    double n1 = Double.parseDouble(System.console().readLine());
    double num1 = n1;
    
    System.out.println("¿Numero 2?");
    double n2 = Double.parseDouble(System.console().readLine());
    
    System.out.println("¿Numero 3?");
    double n3 = Double.parseDouble(System.console().readLine());
    
    if ((n1 < n2) && (n1 < n3)) {
      n1 = n1;
      }
      
    if ((n2 < n1) && (n2 < n3)) {
      n1 = n2;
      n2 = num1;
      }
      
    if ((n3 < n2) && (n3 < n1)) {
      n1 = n3;
      n3 = num1;
      System.out.println(n3);
      }
      
    if (n2 < n3) {
      System.out.println(n1 + " " + n2 + " " + n3);
      } else {
          System.out.println(n1 + " " + n3 + " " + n2);
        }
  }
}
