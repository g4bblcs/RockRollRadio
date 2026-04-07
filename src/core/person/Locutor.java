/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.radio.Programa;
import java.util.ArrayList;

/**
 *
 * @author Gabriela Campo
 */
public class Locutor extends Persona {
    private ArrayList<Programa> programas = new ArrayList<>();
    public Locutor(String nombre) {
        super(nombre);
        this.programas = new ArrayList<>();
    }
    public Programa getPrograma(int index){
        Programa pro = this.programas.get(index);
        return pro;
    }
    public void addPrograma(Programa programa){
        if(!this.programas.contains(programa)){
            this.programas.add(programa);
        }
    }
}
