/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6tema10;
import java.util.Scanner;
import java.util.HashMap;
/**
 *
 * @author Usuario
 */
public class Ej6Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        HashMap <String, String> h = new HashMap();
        
        h.put("Juan", "Pavon");
        
        System.out.println("Introduce el usuario y la contraseña");
        
        int centinela = 0;
        do {
            System.out.println("Usuario:");
            String usuario = s.nextLine();
            
            System.out.println("Contraseña:");
            String contraseña = s.nextLine();
            
            
            if(h.containsKey(usuario)){
                if(h.get(usuario).equals(contraseña)){
                    System.out.println("Inicio de sesión correcto");
                    centinela = 3;
            }
            } else {
                System.out.println("Incorrecto");
                centinela++;
            }
        } while(centinela < 3);
    }
    
}
