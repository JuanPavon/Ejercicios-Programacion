/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9tema9;
import java.text.DecimalFormat;
/**
 *
 * @author Usuario
 */
public class Movil extends Terminal {
    
    private final String tarifa;
    private double total = 0;

    public Movil(String tarifa, String code) {
        super(code);
        this.tarifa = tarifa;
        
    }
    
    
    @Override
    public void llama(Terminal t, int segundosDeLlamada) {
      super.llama(t, segundosDeLlamada);
      double minutos = (double) segundosDeLlamada / 60;

      switch (this.tarifa) {
        case "rata":
          this.total += minutos * 0.06;
          break;
        case "mono":
          this.total += minutos * 0.12;
          break;
        case "bisonte":
          this.total += minutos * 0.30;
          break;
        default:
      }
    }
  
   @Override
    public String toString() {
      DecimalFormat formatoEuros = new DecimalFormat("0.00");
      return "Nº " + this.getCode() + " - " + this.gettConversacion()
              + "s de conversación - tarificados "
              + formatoEuros.format(this.total) + " euros";
    }
    
    
}
