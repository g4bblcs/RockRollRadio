/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.radio.*;
import java.util.ArrayList;

/**
 *
 * @author Gabriela Campo
 */
public class Artista extends Persona {
    private ArrayList<Cancion> canciones = new ArrayList<>();

    public Artista(String nombre) {
        super(nombre);
        this.canciones = new ArrayList<>();
    }
        
}
