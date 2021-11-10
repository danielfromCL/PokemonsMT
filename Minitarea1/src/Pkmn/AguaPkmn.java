package Pkmn;


/**
 * Clase que representa a un pokemón de tipo Agua.
 */
public class AguaPkmn extends Pokemon{

    /**
     * Un AguaPkmn es un Pokemón que es de tipo Agua.
     */
    public AguaPkmn(String nombre, String especie, int puntos) {
        super(nombre, especie, puntos,"Agua");
    }

    /**
     * El pokemón p es avisado que está siendo atacado por este pokemón de tipo Agua.
     */
    @Override
    public void atacar(IPkmn p) {
        p.atacadoporAgua(this);
    }

    /**
     * Si un pokemón de tipo Agua es atacado por un tipo Planta entonces recibe 10 de daño.
     */
    @Override
    public void atacadoporPlanta(PlantaPkmn pp) {
        this.atacadopor(10);
    }

}