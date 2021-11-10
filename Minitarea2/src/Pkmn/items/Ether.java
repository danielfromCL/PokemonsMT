package Pkmn.items;

import Pkmn.IPkmn;

/**
 * Clase que representa un item Ether
 */
public class Ether implements Items{
    private final int x;

    /**
     * Crea un objeto Ether que recupera x PP.
     */
    public Ether(int x) {
        this.x=x;
    }


    public int getX() {
        return x;
    }

    /**
     * Utiliza el ether y recupera el pp del pokemón.
     */
    @Override
    public void usadoEn(IPkmn p) {
        p.setPP(p.getPp()+this.getX());
    }
}
