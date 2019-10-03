public class Ej11Tema4 {
  public static void main (String [] args) {
  
    System.out.println("Este programa calcula el tiempo que falta para medianoche");
    System.out.println("Introduce la hora");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.println("Ahora introduce los minutos");
    int minutos = Integer.parseInt(System.console().readLine());
    
    hora = (24 - hora);
    minutos = (60 - minutos);
    
    System.out.println("Quedan " + ((hora * 360) + (minutos * 60)) + " segundos");
  }
}
