package Pkmn;

import Pkmn.items.*;
import Pkmn.tipo.*;

/**
 * Representa un pokemon.
 */
public interface IPkmn {



    /**
     * El pokemón p ataca.
     */
    void atacar(IPkmn p);

    /**
     * El pokemon es atacado por un pokemón de tipo Fuego.
     */
    void atacadoporFuego(FuegoPkmn pf);

    /**
     * El pokemon es atacado por un pokemón de tipo Planta.
     */

    void atacadoporPlanta(PlantaPkmn pp);

    /**
     * El pokemon es atacado por un pokemón de tipo Agua.
     */
    void atacadoporAgua(AguaPkmn pa);

    /**
     * Retorna los puntos de vida actual de un pokemón.
     */
    int getPuntos();

    /**
     * Retorna el nombre de un pokemón.
     */
    String getNombre();

    /**
     * Retorna la especie de un pokemón.
     */
    String getEspecie();

    /**
     * Retorna el tipo de un pokemón.
     */
    String getTipo();

    /**
     * Retorna el PP maximo de un pokemón.
     */
    int getPpmax();

    /**
     * Retorna el HP maximo de un pokemón.
     */
    int getHpmax();

    /**
     * Retorna el PP actual de un pokemón
     */
    int getPp();

    /**
     * Retorna si el pokemón aún tiene puntos o no.
     */
    boolean siguevivo();

    /**
     * Utiliza un Item i sobre el pokemón.
     */
    void usarItem(Items i);

    /**
     * Modifica el valor del atributo puntos de un pokemón.
     */
     void setPuntos(int puntos);

    /**
     * Modifica el valor del atributo pp de un pokemón.
     */
    void setPP(int pp);


}
