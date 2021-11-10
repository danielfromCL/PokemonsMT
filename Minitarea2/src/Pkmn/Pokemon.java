package Pkmn;

import Pkmn.items.*;
import Pkmn.tipo.*;

/**
 * Una clase abstracta que tiene todos los atributos y comportamientos comunes a todos los pokemones.
 */
public abstract class Pokemon implements IPkmn {
    private final int hpmax;
    private final int ppmax;
    private int pp;
    private int puntos;
    private final String nombre;
    private final String especie;
    private final String tipo;


    /**
     * Un objeto de tipo Pokemon tiene un nombre, una especie, puntos de vida y un tipo.
     */
    public Pokemon(String nombre, String especie, int hpmax, int ppmax, String tipo){
        this.hpmax = hpmax;
        this.ppmax = ppmax;
        this.nombre = nombre;
        this.especie = especie;
        this.tipo = tipo;
        this.puntos = hpmax;
        this.pp = ppmax;
    }

    /**
     * Modifica el valor del atributo puntos de un pokemón.
     * Si es mayor que la vida maxima lo modifico al valor maximo.
     */
    public void setPuntos(int puntos) {
        if(puntos >= hpmax) {
            this.puntos = hpmax;
        }
        else {
            this.puntos = puntos;
        }
    }
    /**
     * Modifica el valor del atributo pp de un pokemón.
     * Si es mayor al pp maximo lo modifico al valor maximo.
     * Si es menor a 0 lo dejo como 0.
     */
    public void setPP(int pp) {
        if(pp >= this.ppmax){
            this.pp = this.ppmax;
        }
        else {
            if (pp <= 0) {
                this.pp = 0; //el minimo de PPs es 0
            } else {
                this.pp = pp;
            }
        }
    }

    @Override
    public int getPuntos() {
        return puntos;
    }
    @Override
    public int getHpmax() {
        return hpmax;
    }

    @Override
    public int getPpmax() {
        return ppmax;
    }

    @Override
    public int getPp() {
        return pp;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getEspecie() {
        return especie;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public boolean siguevivo(){
        if(this.getPuntos() <= 0){
            return false;
        }
        return true;
    }


    /**
     * Modifica la vida del pokemón en base a cuanto de daño recibió.
     * Si recibe daño que lo dejaria con vida negativa, la vida queda en 0.
     */
    protected void atacadopor(int dano) {
        if (this.siguevivo()) {
            this.setPuntos(this.getPuntos() - dano);
            if(this.getPuntos() <= 0){
                this.setPuntos(0);
            }
        }
    }

    /**
     * Como default todos los pokemons reciben 5 de daño al ser atacados por un tipo Fuego.
     */
    @Override
    public void atacadoporFuego(FuegoPkmn pf) {
        this.atacadopor(5);
    }

    /**
     * Como default todos los pokemons reciben 5 de daño al ser atacados por un tipo Planta.
     */
    @Override
    public void atacadoporPlanta(PlantaPkmn pp) {
        this.atacadopor(5);
    }

    /**
     * Como default todos los pokemons reciben 5 de daño al ser atacados por un tipo Agua.
     */
    @Override
    public void atacadoporAgua(AguaPkmn pa) {
        this.atacadopor(5);
    }
    /**
     * Utiliza un Item i sobre el pokemón.
     */
    @Override
    public void usarItem(Items i) {
        i.usadoEn(this);
    }
}