/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5tema11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Juan
 */
public class Ej5Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

        String lineaOrigen = "";
        String lineaDestino = "";
        boolean comentarioDeBloque = false;
        int i = 0;

        while ((lineaOrigen = br.readLine()) != null) {

          int l = lineaOrigen.length();
          lineaDestino = lineaOrigen;

          // Detecta inicio de comentario de bloque 
          if ((i = lineaOrigen.indexOf("/*")) != -1) {
            comentarioDeBloque = true;
            lineaDestino = lineaOrigen.substring(0, i);
            lineaOrigen = lineaDestino;
          }

          // Detecta fin de comentario de bloque 
          if ((i = lineaOrigen.indexOf("*/")) != -1) {
            comentarioDeBloque = false;
            lineaDestino = lineaOrigen.substring(i + 2, l);
          }
          // Detecta comentario de línea
          if (((i = lineaOrigen.indexOf("//")) != -1) && !comentarioDeBloque) {
            lineaDestino = lineaOrigen.substring(0, i);
          }

          if (!comentarioDeBloque) {
            bw.write(lineaDestino + "\n");
          }
        }

        br.close();
        bw.close();

      } catch (IOException e) {
        System.out.println("Error inesperado");
      }
    }
    
}
