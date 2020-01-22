/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6tema9;

/**
 *
 * @author Usuario
 */
public class Tiempo {
    private final int horas;
    private final int minutos;
    private final int segundos;
    
    private final long tSegundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.tSegundos = (horas * 3600) + (minutos * 60) + segundos;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    @Override
    public String toString () {
        return horas + "h " + minutos + "m " + segundos + "s";
    }

    public long getSegundos() {
        return tSegundos;
    }
    
    public Tiempo suma(Tiempo t1, Tiempo t2) {
        long x = t1.getSegundos() + t2.getSegundos();
        
        int h = (int) (x / 3600);
        x %= 3600; 
        int m = (int) (x / 60);
        int s = (int) (x % 60);
        
        Tiempo tr = new Tiempo(h, m, s);
        return tr;
    }
    
    public Tiempo resta(Tiempo t1, Tiempo t2) {
        long x = t1.getSegundos() - t2.getSegundos();
        
        if(x  < 0) {
            x = -x; 
        }
        
        int h = (int) (x / 3600);
        x %= 3600; 
        int m = (int) (x / 60);
        int s = (int) (x % 60);
        
        Tiempo tr = new Tiempo(h, m, s);
        return tr;
    }
}
