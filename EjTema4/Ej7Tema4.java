public class Ej7Tema4 {
  public static void main (String [] args) {
    System.out.println("Este programa calcula la media de tres notas");
    System.out.println("Introduce la primera nota");
    
    double n1 = Double.parseDouble(System.console().readLine());
    
    if (0 < n1) {
      System.out.println("Introduce otra nota");
      double n2 = Double.parseDouble(System.console().readLine());
      
      if (0 < n2) {
        System.out.println("Introduce la última nota");
        double n3 = Double.parseDouble(System.console().readLine());
        
        if (0 < n3) {
          System.out.println("La media es " + ((n1 + n2 + n3) / 3));
          } else {
            System.out.println("El dato introducido no es correcto");
            }
        } else {
          System.out.println("El dato introducido no es correcto");
          }
      } else {
        System.out.println("El dato introducido no es correcto");
        }
  }
}
