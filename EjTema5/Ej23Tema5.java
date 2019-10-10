public class Ej23Tema5 {
  public static void main (String [] args) {
    
    System.out.println("Introduce tantos números como quieras");
    System.out.println("El programa terminará cuando su suma supere el valor de 10000");
    
    int suma = 0;
    int contador = 0;
    int num;
    
    do {
      num = Integer.parseInt(System.console().readLine());
      suma = suma + num;
      contador++;
      } while (suma < 10000);
      
    System.out.println("El total acumulado es " + suma);
    System.out.println("El contador de los números introducido es " + contador);
    System.out.println("La media es " + ((double) suma / contador));
  }
}
