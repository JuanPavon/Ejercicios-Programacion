public class Ej27Tema5 {
  public static void main (String [] args) {
  
    System.out.println("¡Hola! Soy un programa que muestra, cuenta y sumo los múltiplos de 3 que hay entre uno y el número que tú eligas");
    System.out.println("Por favor, intoduce el número");
    int num = Integer.parseInt(System.console().readLine());
    int contador1 = 0;
    int contador2 = 3;
    int suma = 0;
    
    do {
      System.out.println(contador2);
      suma = suma + contador2;
      contador1++;
      contador2 = contador2 +3;
      } while (contador2 <= num);
      
    System.out.println("La cantidad de números es " + contador1);
    System.out.println("La suma de los números es " + suma);
  }
}
