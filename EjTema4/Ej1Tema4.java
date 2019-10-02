public class Ej1Tema4 {
	public static void main (String [] args) {
  /*Ejercicio 1 Escribe un programa que pida por teclad un día de la semana
   * y que diga qué asignatura toca a primera hora ese día.
   */
    System.out.println("Dime un día de la semana y yo te diré que asiganatura toca a primera hora ese día");
    String dia = System.console().readLine();
    
    switch (dia) {
      
      case "Lunes":
        System.out.println("Programación");
        break;
        
      case "Martes":
        System.out.println("Entornos de desarrollo");
        break;
        
      case "Miercoles":
        System.out.println("Programación");
        break;
        
      case "Jueves":
        System.out.println("Programación");
        break;
        
      case "Viernes":
        System.out.println("Sistemas informaticos");
        break;
        
      default:
        System.out.println("No es correcto");
      }
  }
}
