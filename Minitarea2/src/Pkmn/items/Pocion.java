package Pkmn.items;

import Pkmn.IPkmn;

/**
 * Clase que representa un item Poción.
 */
public class Pocion implements Items{
    private final int x;

    /**
     * Crea un objeto Pocion que recupera x HP.
     */
    public Pocion(int x) {
        this.x=x;
    }

    public int getX() {
        return x;
    }

    /**
     * Utiliza la poción y recupera la vida del pokemón.
     */
    @Override
    public void usadoEn(IPkmn p) {
        p.setPuntos(p.getPuntos()+this.getX());
    }
}
