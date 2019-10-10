public class Ej21Tema5 {
  public static void main (String [] args) {
  
    System.out.println("Introduce todos los numeros que quieras");
    System.out.println("Cuando hayas terminado introduce un número negativo");
    
    int num = 0;
    int acuImpares = 0;
    int par = 0;
    int contador = 0;
    
    do {
      if (num % 2 == 0) {
        if (num > par) {
          par = num;
          }
        } else {
          acuImpares = acuImpares + num;
          contador++;
          }
      num = Integer.parseInt(System.console().readLine());
      } while (num >= 0);
      
    System.out.println("La media de los impares es " + ((double)acuImpares / contador));
    System.out.println("El mayor de los pares es " + par);
  }
}
