public class Ej12Tema3 {
	public static void main (String [] args) {
  
    System.out.println("Introduce la nota del primer examen");
    Double NotaExamen = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce la nota que deseas sacar");
    Double NotaFinal = Double.parseDouble(System.console().readLine());
    
    System.out.print("La nota que necesitas es " + ((NotaFinal - (0.4 * NotaExamen)) / 0.6));
  }
}
