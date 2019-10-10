public class Ej13Tema5 {
  public static void main (String [] args) {
  
    System.out.println("Introduce una lista de 10 numeros enteros");
    
    int n[] = new int[10];
    
    for(int i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
      }
      
    for(int ii = 0; ii < 10; ii++) {
      if ((n[ii] % 2) == 0) {
        System.out.println(n[ii] + " Es par");
        } else {
          System.out.println(n[ii] + " Es impar");
          }
      }
  }
}
