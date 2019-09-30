public class Ej11Tema3 {
	public static void main (String [] args) {
    System.out.println("Introduce el numero de kb que quieres convertir a mb");
    int x = Integer.parseInt(System.console().readLine());
    
    System.out.println(x + "kb son " + (x / 1000) + "mb");
  }
}
