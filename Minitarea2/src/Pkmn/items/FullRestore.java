package Pkmn.items;

import Pkmn.IPkmn;

/**
 * Clase que representa un item FullRestore
 */
public class FullRestore implements Items {

    /**
     * Crea un objeto FullRestore que recupera todo el HP y PP.
     */
    public FullRestore() {
    }
    /**
     * Utiliza el full restore y recupera toda la vida y todo el PP del pokemón.
     */
    @Override
    public void usadoEn(IPkmn p) {
        p.setPuntos(p.getHpmax());
        p.setPP(p.getPpmax());
    }
}
