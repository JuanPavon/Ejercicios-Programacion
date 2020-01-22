/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7tema9;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ej7Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);
        
        int troyano = 0;
        
        do {
            System.out.println("1. Mostrar numero de entradas disponibles");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            troyano = s.nextInt();
            
            if (troyano == 1) {
                System.out.println("Zona principal: " + principal.getEntradasPorVender()+ " entradas restantes");
                System.out.println("Zona compra-venta: " + compraVenta.getEntradasPorVender() + " entradas restantes");
                System.out.println("Zona VIP: " + vip.getEntradasPorVender() + " entradas restantes");
            }
            
            if (troyano == 2) {
                System.out.println("Seleccione la zona en la que desea comprar sus entradas");
                System.out.println("1. Zona principal");
                System.out.println("2. Zona compra-venta");
                System.out.println("3. Zona VIP");
                int x = s.nextInt();
                
                if(x == 1) {
                    System.out.println("Introduzca el numero de entradas que desea");
                    int n = s.nextInt();
                    principal.vender(n);
                }
                
                if(x == 2) {
                    System.out.println("Introduzca el numero de entradas que desea");
                    int n = s.nextInt();
                    compraVenta.vender(n);
                }
                
                if(x == 3) {
                    System.out.println("Introduzca el numero de entradas que desea");
                    int n = s.nextInt();
                    vip.vender(n);
                }
            }
            System.out.println();
        } while (troyano != 3);
        
    }
    
}
