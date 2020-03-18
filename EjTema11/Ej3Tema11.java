/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3tema11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Juan
 */
public class Ej3Tema11 {

    /**
     * No entiendo lo que falla
     */
    public static void main(String[] args) {

        try {
          BufferedReader bf1 = new BufferedReader(new FileReader(args[0]));
          BufferedReader bf2 = new BufferedReader(new FileReader(args[1]));
          BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));

          String linea1 = " ";
          String linea2 = " ";

          while ( (linea1 != null) || (linea2 != null) ) {
            linea1 = bf1.readLine();
            linea2 = bf2.readLine();

            if (linea1 != null) {
              bw.write(linea1 + "\n");
            }

            if (linea2 != null) {
              bw.write(linea2 + "\n");
            }
          } 

          bf1.close();
          bf2.close();
          bw.close();

        } catch (IOException e) {
          System.out.println("Se ha producido un error"); 
        }
    }
    
}
