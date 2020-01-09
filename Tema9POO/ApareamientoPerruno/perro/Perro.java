/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerejpoo.perro;

/**
 *
 * @author Usuario
 */
public class Perro {
    String nombre;
    int identificador;
    String raza;
    String sexo;

    //constructor
    public Perro(String nombre, int identificador, String raza, String sexo) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.raza = raza;
        this.sexo = sexo;
    }


    public void ladra(){
        System.out.println("Guau");
    }
    
    public void saluda() {
        System.out.println("Guau! Me llamo " + nombre + " Guau!");
    }
    
    //getter
    String getSexo() {
        return this.sexo;
    }

    //metodo para aparear
    public boolean apareaCon(Perro pluto, Perro gooffy) {
        return !pluto.getSexo().equals(gooffy.getSexo());
    }
}
