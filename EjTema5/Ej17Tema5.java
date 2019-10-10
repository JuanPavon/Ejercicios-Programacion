public class Ej17Tema5 {
  public static void main (String [] args) {
    
    System.out.println("Introduce un número por teclado y sumaré los 100 números siguientes");
    int num = Integer.parseInt(System.console().readLine());
    int aux = num;
    
    if (num > 0) {
      for (int i = 0; i < 100; i++) {
        aux = aux + 1;
        num = num + aux;
        }
      System.out.println("La suma es " + num);
      } else {
          System.out.println("El número introducido no es correcto");
        }
    
  }
}
