/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4tema11;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 *
 * @author Juan
 */
public class Ej4Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
          BufferedReader br = new BufferedReader(new FileReader(args[0]));
          int l = args[0].length();
          String nombre = args[0].substring(0, l - 4);
          String extension = args[0].substring(l - 4, l);

          BufferedWriter bw = new BufferedWriter(new FileWriter(nombre + "_sort" + extension));

          Vector<String> v = new Vector<String>();

          String linea = "";
          while (linea != null) {
            v.addElement(linea);
            linea = br.readLine();
          }
          br.close();

          v.removeElementAt(0);
          Collections.sort(v);

          for (String s: v) {
            bw.write(s + "\n");
          }

          bw.close();
        } catch (IOException ioe) {
          System.err.println(ioe.getMessage());
        }
    }
    
}
