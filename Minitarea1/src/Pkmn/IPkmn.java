package Pkmn;

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
     * Modifica el valor del atributo puntos de un pokemón.
     */
    void setPuntos(int puntos);

    /**
     * Retorna los puntos de un pokemón.
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
     * Retorna si el pokemón aún tiene puntos o no.
     */
    boolean siguevivo();


}
