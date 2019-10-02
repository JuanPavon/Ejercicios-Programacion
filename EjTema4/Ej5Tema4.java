public class Ej5Tema4 {
	public static void main (String [] args) {
  
    System.out.println("Este programa resuelve ecuaciones tales que ax + b = 0");
    System.out.println("Introduce el valor de a");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el valor de b");
    double b = Double.parseDouble(System.console().readLine());
    
    double x = ((- b) / a);
    
    if ((-100000000 < x) && (x < 100000000)) {
      System.out.println(x);
      } else {
          System.out.println("No tiene solucion real");
        }
  }
}
