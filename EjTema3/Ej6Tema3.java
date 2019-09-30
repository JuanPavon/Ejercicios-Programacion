public class Ej6Tema3 {
	public static void main (String [] args) {
  
    System.out.println("Voy a calcular el area del triangulo que elijas");
    System.out.println("Introduce la base");
    int Base = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce la altura");
    int Altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("La base del rectangulo es " + ((Base * Altura) / 2));
  }
}
