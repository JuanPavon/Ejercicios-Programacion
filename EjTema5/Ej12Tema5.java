public class Ej12Tema5 {
  public static void main (String [] args) {
    
    System.out.println("Introduce el número de términos de la serie de Fibinacci que quieras que saque");
    int n = Integer.parseInt(System.console().readLine());
    
    if (n == 1) {
      System.out.println("0");
      } else if (n == 2) {
        System.out.println("0");
        System.out.println("1");
        } else {
          System.out.println("0");
          System.out.println("1");
          int n1 = 0;
          int n2 = 1;
          int nAux;
          n = n - 2;
          
          for (int i = 0; i < n; i++) {
            nAux = n1;
            n1 = n2;
            n2 = n2 + nAux;
            System.out.println(n2);
        } 
      }
  }
}
