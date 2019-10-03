public class Ej6Tema4 {
  public static void main (String [] args) {
    System.out.println("Voy a calcular el tiempo que tardará en caer un objeto");
    System.out.println("Introduce al valor de h");
    
    double h = Double.parseDouble(System.console().readLine());
    
    double tiempo = Math.sqrt(((2 * h) / 9.81));
    
    if ((-100000000 < tiempo) && (tiempo < 100000000)) {
      System.out.println("Tardará " + tiempo + " segundos en caer");
      } else {
        System.out.println("Lo siento, la solución no es un número real");
        }
  }
}
