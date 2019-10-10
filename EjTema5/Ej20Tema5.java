public class Ej20Tema5 {
  public static void main (String [] args) {
  
    int contador2 = 2; //controla el número de caracteres que se pinta
    
    System.out.println("Introduce la altura de la pirámide");
    int altura = Integer.parseInt(System.console().readLine());
    int aux = altura; //controla las lineas que se pintan
    
    System.out.println("Introduce el carácter del que estará formada la pirámide");
    String caracter = System.console().readLine();
    
    //pinta el vertice de la piramide
    for (int ii = 1; ii < aux; ii++) {
        System.out.print(" ");
        }
      System.out.println(caracter);
    
    for (int i = 1; i < altura; i++) {
      
      //pinta los espacios
      for (int ii = 2; ii < aux; ii++) {
        System.out.print(" ");
        }
      aux--;
      System.out.print(caracter);
      
      int contador1 = 1;
      
      //pinta la ultima linea
      if (i == (altura - 1)) {
        contador1 = 1;
        while (contador1 < contador2) {
          System.out.print(caracter);
          contador1++;
        }
      }
      
      //pinta las filas, tanto espacios como caracteres
      while (contador1 < contador2) {
        System.out.print(" ");
        contador1++;
        } if (contador1 == contador2) {
          System.out.print(caracter);
          }
      contador2 = contador2 + 2;
      
      System.out.println(""); //salto de linea
      
    }
  }
}
