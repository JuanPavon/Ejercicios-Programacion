public class Ej22Tema5 {
  public static void main (String [] args) {
  
    int tope = 0;
    int contador = 1;
    
    for (int i = 2; i < 101; i++) {
      contador = 1;
      tope = 0;
      do {
        if ((i % contador) == 0) {
          tope++;
          }
        contador++;
        } while (i >= contador);
        
      if (tope == 2) {
        System.out.println(i + " Es primo");
        }
    }
  }
}
