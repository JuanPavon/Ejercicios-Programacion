public class Ej8Tema4 {
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
          double media = ((n1 + n2 + n3) / 3);
          
          //aqui empieza el ej 8
          
          if ((0 < media) && (media < 4)) {
            System.out.println("La media es " + media + ", insuficiente");
            }
          
          if (media == 5) {
            System.out.println("La media es " + media + ", suficiente");
          }
            
          if (media == 6) {
            System.out.println("La media es " + media + ", bien");
            }
            
          if ((media == 7) || (media == 8)) {
            System.out.println("La media es " + media + ", notable");
            }
            
          if ((media == 9) || (media == 10)) {
            System.out.println("La media es " + media + ", sobresaliente");
            }
            // aqui termina el ej 8
            
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
