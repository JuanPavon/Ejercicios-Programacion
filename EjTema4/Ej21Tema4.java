public class Ej21Tema4 {
  public static void main (String [] args) {
  
    System.out.println("¿Nota del primer examen?");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.println("¿Nota del segundo examen?");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2) / 2;
    
    if (media < 5) {
      System.out.println("¿Cuál ha sido el resultado de la recuperación?");
      System.out.println("¿apto o no apto?");
      String recuperacion = System.console().readLine();
      if (recuperacion.equals("apto")) {
        media = 5;
      }
    }
    
    System.out.println("Tu nota es " + media);
  }
}
