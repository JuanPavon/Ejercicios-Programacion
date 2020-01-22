/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9tema9;

/**
 *
 * @author Usuario
 */
public class Terminal {
    private final String code;
    private int tConversacion = 0;

    public Terminal(String code) {
        this.code = code;
    }

    public int gettConversacion() {
        return tConversacion;
    }
    
    public String getCode() {
        return code;
    }
    
    @Override
    public String toString(){
        return "Nº " + code + " - " + tConversacion + "s de conversacion";
    }
    
    
    public void llama(Terminal t, int t1) {
        this.tConversacion += t1;
        t.tConversacion += t1;
    }
}
