
public class Ej4Tema3 {
	public static void main (String [] args) {
	
		System.out.println("Dime un numero");
		int x = Integer.parseInt(System.console().readLine());
		
		System.out.println("Ahora otro");
		int y = Integer.parseInt(System.console().readLine());
		
		System.out.println("El resultado de la suma es " + (x + y));
		System.out.println("El resultado de la resta es " + (x - y));
		System.out.println("El resultado de la multiplicacion es " + (x * y));
		System.out.println("El resultado de la division es " + ((double)x / y));
	}
}
