public class Ej8Tema3 {
	public static void main (String [] args) {
  
    System.out.println("Introduce las horas semanales trabajadas");
    int x = Integer.parseInt(System.console().readLine());
    
    System.out.println("El salario es de " + (x * 12) + "€");
  }
}
