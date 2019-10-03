public class Ej9Tema4 {
  public static void main (String [] args) {
    System.out.println("Este programa calcula ecuaciones de segundo grado");
    
    System.out.println("Introduce el valor de a");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el valor de b");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el valor de c");
    double c = Double.parseDouble(System.console().readLine());
    
    double x1 = (((-b) + Math.sqrt((b*b) - (4 * a * c))) / (2 * a));
    double x2 = (((-b) - Math.sqrt((b*b) - (4 * a * c))) / (2 * a));
    
    if ((-1000000000 < x1) && (x1 < 1000000000)) {
      System.out.println("La primera solución es " + x1);
      } else {
        System.out.println("La primera solucion no es un número real");
        }
        
    if ((-1000000000 < x2) && (x2 < 1000000000)) {
      System.out.println("La segunda solución es " + x2);
      } else {
        System.out.println("La segunda solucion no es un número real");
        }
  }
}
