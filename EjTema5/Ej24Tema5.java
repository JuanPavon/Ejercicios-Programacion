public class Ej24Tema5 {
  public static void main (String [] args) {
    
    System.out.println("Introduce la altura de la pirámide");
    int altura = Integer.parseInt(System.console().readLine());
    int aux = altura; //controla las lineas que se pintan
    int iii = 0;
    int contador = 1;
    
    for (int i = -1; i < altura; i++) {
      
      //pinta los espacios
      for (int ii = 0; ii < aux; ii++) {
        System.out.print(" ");
        }
      aux--;
      
      for (iii = 1; iii < (contador - 1); iii++) {
        System.out.print(iii);
        }
      
      for (iii = (contador - 1);iii > 0; iii--) {
        System.out.print(iii);
        }
      
      System.out.println("");
      contador++;
    }
  }
}
