public class Ej11Tema5 {
  public static void main (String [] args) {
  
    System.out.println("Introduce un número");
    int num = Integer.parseInt(System.console().readLine());
    
    for(int i = 0; i < 5; i++) {
      System.out.printf("%-10d %-10d %-10d\n", num, (num * num), (num * num * num));
      num++;
      }
  }
}
