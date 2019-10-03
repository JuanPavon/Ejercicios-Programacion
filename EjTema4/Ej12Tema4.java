public class Ej12Tema4 {
  public static void main (String [] args) {
    
    int nota = 0;
    String respuesta;
    
    System.out.println("Vas a realizar un programa sobre las asignaturas del instituto");
    System.out.println("Deberás introducir la letra correcta para puntuar");
    
    System.out.println("");
    System.out.println("1.Las siglas DED corresponden a:");
    System.out.println("a. Derecho Estricto de Desarrollo");
    System.out.println("b. Diagrama de Estructura de Datos");
    System.out.println("c. Diploma Empírico Dictatorial");
    
    respuesta = System.console().readLine();
    
    if (respuesta.equals("b")) {
      nota++;
      }
    
    System.out.println("");
    System.out.println("2. Una variable entera en java se declara con la sentencia:");
    System.out.println("a. readLine");
    System.out.println("b. double");
    System.out.println("c. int");
    
    respuesta = System.console().readLine();
    
    if (respuesta.equals("c")) {
      nota++;
      }
    
    System.out.println("");
    System.out.println("3. Una clave primaria:");
    System.out.println("a. Nunca puede ser nula");
    System.out.println("b. Puede ser cero");
    System.out.println("c. Se puede repetir");
    
    respuesta = System.console().readLine();
    
    if (respuesta.equals("a")) {
      nota++;
      }
    
    System.out.println("");
    System.out.println("4. El lenguaje más utilizado actualmente es:");
    System.out.println("a. Java");
    System.out.println("b. Phython");
    System.out.println("c. C++");
    
    respuesta = System.console().readLine();
    
    if (respuesta.equals("a")) {
      nota++;
      }
    
    System.out.println("");
    System.out.println("5. El tipo de correspondencia entre departamento - empleado es:");
    System.out.println("a. 1 a n");
    System.out.println("b. 1 a 1");
    System.out.println("c. 1 a 0");
    
    respuesta = System.console().readLine();
    
    if (respuesta.equals("a")) {
      nota++;
      }
    
    System.out.println("");
    System.out.println("6. Un ejemplo de bucle en java es:");
    System.out.println("a. for");
    System.out.println("b. int");
    System.out.println("c. if");
    
    respuesta = System.console().readLine();
    
    if (respuesta.equals("a")) {
      nota++;
      }
    
    System.out.println("");
    System.out.println("7. El lenguaje mas usado para desarrollo web es:");
    System.out.println("a. HTML5");
    System.out.println("b. C++");
    System.out.println("c. JavaScript");
    
    respuesta = System.console().readLine();
    
    if (respuesta.equals("a")) {
      nota++;
      }
    
    System.out.println("");
    System.out.println("8. Un buen ejemplo de editor de texto es:");
    System.out.println("a. Geany");
    System.out.println("b. Bloc de notas");
    System.out.println("c. Microsoft Word");
    
    respuesta = System.console().readLine();
    
    if (respuesta.equals("a")) {
      nota++;
      }
    
    System.out.println("");
    System.out.println("9. Los primeros lenguajes de programación:");
    System.out.println("a. Fue Java");
    System.out.println("b. Eran ceros y unos");
    System.out.println("c. Nacieron en África");
    
    respuesta = System.console().readLine();
    
    if (respuesta.equals("b")) {
      nota++;
      }
    
    System.out.println("");
    System.out.println("10. El profesor de programación:");
    System.out.println("a. Es feo");
    System.out.println("b. Es guapo");
    System.out.println("c. Manda muchos deberes");
    
    respuesta = System.console().readLine();
    
    if (respuesta.equals("c")) {
      nota++;
      }
      
    System.out.println("Tu nota es " + nota);
  }
}
