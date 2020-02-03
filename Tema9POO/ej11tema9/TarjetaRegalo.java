/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11tema9;

/**
 *
 * @author Usuario
 */
public class TarjetaRegalo {
    private final int code;
    private double saldo;

    public TarjetaRegalo(double saldo) {
        this.code = (int)(Math.random() * 100000);
        this.saldo = saldo;
    }
    
    public void gasta(double x){
        if(this.saldo - x < 0){
            System.out.println("No tiene suficiente saldo para gastar " + x);
        } else {
            this.saldo -= x;
        }
    }
    
    public TarjetaRegalo fusionaCon(TarjetaRegalo t){
        TarjetaRegalo t3 = new TarjetaRegalo(this.saldo + t.saldo);
        this.saldo = 0;
        t.saldo = 0;
        return t3;
    }
    
    @Override
    public String toString(){
        return "Tarjeta nº " + this.code + " - Saldo " + this.saldo;
    }
}