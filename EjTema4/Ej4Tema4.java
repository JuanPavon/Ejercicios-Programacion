public class Ej4Tema4 {
	public static void main (String [] args) {
  
    System.out.println("¿Cuantas horas has trabajado?");
    
    int horas = Integer.parseInt(System.console().readLine());
    
    if (horas > 40) {
      System.out.println("Tu salario es " + ((40 * 12) + ((horas - 40) * 16)));
      } else {
          System.out.println("Tu salario es " + (horas * 12));
        }
  }
}
