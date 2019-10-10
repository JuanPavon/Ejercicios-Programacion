public class Ej19Tema5 {
  public static void main (String [] args) {
  
    
    int contador2 = 2; //controla el número de caracteres que se pinta
    
    System.out.println("Introduce la altura de la pirámide");
    int altura = Integer.parseInt(System.console().readLine());
    int aux = altura; //controla las lineas que se pintan
    
    System.out.println("Introduce el carácter del que estará formada la pirámide");
    String caracter = System.console().readLine();
    
    for (int i = 0; i < altura; i++) {
      
      //pinta los espacios
      for (int ii = 1; ii < aux; ii++) {
        System.out.print(" ");
        }
      aux--;
      
      //pinta los caracteres
      int contador1 = 1;
      while (contador1 < contador2) {
        System.out.print(caracter);
        contador1++;
      }
      contador2 = contador2 + 2;
      System.out.println("");
    }
  }
}
