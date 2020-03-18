/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6tema11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Juan
 */
public class Ej6Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      try {
          
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String palabra = args[1];
        String linea = "";
        int i = 0;
        int repeticiones = 0;

        while ((linea = br.readLine()) != null) {

          while ((i = linea.indexOf(palabra)) != -1) {
            linea = linea.substring(i + palabra.length(), linea.length());
            repeticiones++;
          }
        }

        br.close();

        System.out.println("La palabra " + palabra + " aparece " + repeticiones + " veces en el fichero.");

      } catch (IOException ioe) {
        System.err.println(ioe.getMessage());
      }
    }
    
}
