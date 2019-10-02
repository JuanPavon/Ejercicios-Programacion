public class Ej2Tema4 {
	public static void main (String [] args) {
    System.out.println("¿Qué hora es?");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((6 < hora) && (hora < 12)){
      System.out.println("Buenos días");
      }
      
    if ((13 < hora) && (hora < 20)) {
      System.out.println("Buenas tardes");
      }
      
    if ((21 < hora) || (hora < 5)) {
      System.out.println("Buenas noches");
      }
  }
}
