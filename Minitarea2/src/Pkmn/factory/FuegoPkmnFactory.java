package Pkmn.factory;

import Pkmn.IPkmn;
import Pkmn.tipo.FuegoPkmn;

/**
 * Factory que crea objetos de FuegoPkmn.
 */
public class FuegoPkmnFactory implements PkmnFactory{

    String especie;
    int hpmax;
    int ppmax;
    /**
     * Construye una fábrica de FuegoPkmns.
     * Tiene como parametro predeterminado una especie generica.
     * Todos los pokemons de tipo fuego tienen 40 de hpmax y 25 ppmax (Opté por esto pero además hay setters si la persona lo quiere cambiar para una especie especifica).
     * También pensé en utilizar un metodo crearPkmn que recibiera todos los parametros especificos, pero preferí no darle tanta libertad al usuario y que tenga que hacerlo a través de los setters de la fábrica específica.
     */
    public FuegoPkmnFactory() {
        this.especie = "EspecieGenericaFuego";
        this.hpmax = 40;
        this.ppmax = 25;
    }

    /**
     * Crea un FuegoPkmn con su nombre.
     * Utiliza los parametros de la fábrica para los demás stats.
     */
    @Override
    public IPkmn crearPkmn(String nombre){
        return new FuegoPkmn(nombre, this.especie,this.hpmax,this.ppmax);
    }
    @Override
    public void setEspecie(String especie){
        this.especie = especie;
    }
    @Override
    public void setHpmax(int hpmax){
        this.hpmax = hpmax;
    }
    @Override
    public void setPpmax(int ppmax){
        this.ppmax = ppmax;
    }
}
