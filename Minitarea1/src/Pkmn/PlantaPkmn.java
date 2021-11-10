package Pkmn;
/**
 * Clase que representa a un pokemón de tipo Planta.
 */
public class PlantaPkmn extends Pokemon{

    /**
     * Un PlantaPkmn es un Pokemón que es de tipo Planta.
     */
    public PlantaPkmn(String nombre, String especie, int puntos) {
        super(nombre, especie, puntos,"Planta");
    }

    /**
     * El pokemón p es avisado que está siendo atacado por este pokemón de tipo Planta.
     */
    @Override
    public void atacar(IPkmn p) {
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