public class Ej16Tema5 {
  public static void main (String [] args) {
  
    System.out.println("Introduce un número y te diré si es primo o no");
    int num = Integer.parseInt(System.console().readLine());
    int tope = 0;
    
    for(int i = 1; i < (num + 1); i++)
      if ((num % i) == 0) {
        tope++;
        }
     
      
    if (tope == 2) {
      System.out.println(num + " Es primo");
      } else {
        System.out.println(num + " No es primo");
        }
  }
}
