public class Ej9Tema5 {
  public static void main (String [] args) {
  
    System.out.println("Introduce un número");
    int num = Integer.parseInt(System.console().readLine());
    int nD = 1;
    
    while(num > 10) {
      num = num / 10;
      nD++;
      } 
      
    System.out.println("Tiene " + nD + " digitos");
  }
}
