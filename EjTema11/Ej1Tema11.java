/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1tema11;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Juan
 */
public class Ej1Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

            for (int i = 1; i < 501; i++) {
              if (primo(i)) {
                bw.write(String.valueOf(i) + "\n");
              }
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir");
        }
    }
    
    public static boolean primo(int x){
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
