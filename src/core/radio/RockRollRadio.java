/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.radio;

import core.person.*;
import core.radio.*;
import java.util.ArrayList;

/**
 *
 * @author Gabriela Campo
 */
public class RockRollRadio {
    private ArrayList<Artista> artistas = new ArrayList<>();
    private ArrayList<Cancion> canciones = new ArrayList<>();
    private ArrayList<Invitado> invitados = new ArrayList<>();
    private ArrayList<Locutor> locutores = new ArrayList<>();
    private ArrayList<Programa> programas = new ArrayList<>();

    public RockRollRadio() {
        this.artistas = new ArrayList<>();
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.locutores = new ArrayList<>();
        this.programas = new ArrayList<>();
    }
    
    public void addArtista(Artista artista){
        if(!this.artistas.contains(artista)) this.artistas.add(artista);
    }
        public void addCancion(Cancion cancion){
        if(!this.canciones.contains(cancion)) this.canciones.add(cancion);
    }
    
}
