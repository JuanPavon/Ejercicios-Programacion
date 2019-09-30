import java.lang.Math;

public class Ej9Tema3 {
	public static void main (String [] args) {
  
    System.out.println("Para calcular el volumen de un cono necesito su altura y el radio de la base");
    System.out.println("Altura");
    int Altura = Integer.parseInt(System.console().readLine());
    System.out.println("Radio de la base");
    int Radio = Integer.parseInt(System.console().readLine());
    
    System.out.println("El volumen del circulo es " + ((Math.PI * Radio * Radio *Altura) / 3));
  }
}
