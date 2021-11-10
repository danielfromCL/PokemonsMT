package Pkmn;

/**
 * Una clase abstracta que tiene todos los atributos y comportamientos comunes a todos los pokemones.
 */
public abstract class Pokemon implements IPkmn {
    private int puntos;
    private final String nombre;
    private final String especie;
    private final String tipo;

    /**
     * Un objeto de tipo Pokemon tiene un nombre, una especie, puntos de vida y un tipo.
     */
    public Pokemon(String nombre, String especie, int puntos, String tipo){
        this.puntos = puntos;
        this.nombre = nombre;
        this.especie = especie;
        this.tipo = tipo;
    }

    @Override
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public int getPuntos() {
        return puntos;
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
        else{
            return true;
        }
    }


    /**
     * Modifica la vida del pokemón en base a cuanto de daño recibió.
     */
    void atacadopor(int dano) {
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
}