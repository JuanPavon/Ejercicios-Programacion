public class Ej10Tema3 {
	public static void main (String [] args) {
    System.out.println("Introduce el numero de mb que quieres convertir a kb");
    int x = Integer.parseInt(System.console().readLine());
    
    System.out.println(x + "mb son " + (x * 1000) + "kb");
  }
}
