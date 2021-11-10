package Pkmn.tipo;

import Pkmn.IPkmn;
import Pkmn.*;


/**
 * Clase que representa a un pokemón de tipo Planta.
 */
public class PlantaPkmn extends Pokemon {

    /**
     * Un PlantaPkmn es un Pokemón que es de tipo Planta.
     */
    public PlantaPkmn(String nombre, String especie, int hpmax, int ppmax) {
        super(nombre, especie, hpmax, ppmax, "Planta");
    }

    /**
     * El pokemón p es avisado que está siendo atacado por este pokemón de tipo Planta.
     */
    @Override
    public void atacar(IPkmn p) {
        this.setPP(this.getPp()-1);
        p.atacadoporPlanta(this);
    }

    /**
     * Si un pokemón de tipo Planta es atacado por un tipo Fuego entonces recibe 10 de daño.
     */
    @Override
    public void atacadoporFuego(FuegoPkmn pf) {
        this.atacadopor(10);
    }
}
