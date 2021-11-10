package Pkmn.tipo;

import Pkmn.IPkmn;
import Pkmn.Pokemon;
import Pkmn.tipo.AguaPkmn;

/**
 * Clase que representa a un pokemón de tipo Fuego.
 */
public class FuegoPkmn extends Pokemon {

    /**
     * Un FuegoPkmn es un Pokemón que es de tipo Fuego.
     */
    public FuegoPkmn(String nombre, String especie, int hpmax, int ppmax) {
        super(nombre, especie, hpmax,ppmax,"Fuego");
    }

    /**
     * El pokemón p es avisado que está siendo atacado por este pokemón de tipo Fuego.
     */
    @Override
    public void atacar(IPkmn p) {
        this.setPP(this.getPp()-1);
        p.atacadoporFuego(this);
    }

    /**
     * Si un pokemón de tipo Fuego es atacado por un tipo Agua entonces recibe 10 de daño.
     */
    @Override
    public void atacadoporAgua(AguaPkmn pa) {
        this.atacadopor(10);
    }
}