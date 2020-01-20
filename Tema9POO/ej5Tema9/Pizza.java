/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5tema9;

/**
 *
 * @author Usuario
 */
public class Pizza {
    String tipo;
    String tamaño;
    String estado;
    static int nPedidas = 0;
    static int nServidas = 0;
    
    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = "pedida";
        Pizza.nPedidas++;
    }

    @Override
    public String toString() {
        return "La pizza " + this.tipo + ", " + this.tamaño + ", esta " + this.estado;
    }

    public static int getnPedidas() {
        return nPedidas;
    }

    public static int getnServidas() {
        return nServidas;
    }
    
    public void sirve() {
        if(this.estado.equals("pedida")) {
            this.estado = "servida";
            Pizza.nServidas++;
        } else {
            System.out.println("Ya esta servida");
        }
    }
}
