package Pkmn.factory;


import Pkmn.IPkmn;
import Pkmn.tipo.PlantaPkmn;

/**
 * Factory que crea objetos de PlantaPkmn.
 */
public class PlantaPkmnFactory implements PkmnFactory{

    String especie;
    int hpmax;
    int ppmax;

    /**
     * Construye una fábrica de PlantaPkmns.
     * Tiene como parametro predeterminado una especie generica.
     * Todos los pokemons de tipo planta tienen 50 de hpmax y 20 ppmax (Opté por esto pero además hay setters si la persona lo quiere cambiar para una especie especifica).
     * También pensé en utilizar un metodo crearPkmn que recibiera todos los parametros especificos, pero preferí no darle tanta libertad al usuario y que tenga que hacerlo a través de los setters de la fábrica específica.
     */
    public PlantaPkmnFactory() {
        this.especie = "EspecieGenericaPlanta";
        this.hpmax = 50;
        this.ppmax = 20;
    }
    /**
     * Crea un PlantaPkmn con su nombre.
     * Utiliza los parametros de la fábrica para los demás stats.
     */
    @Override
    public IPkmn crearPkmn(String nombre){
        return new PlantaPkmn(nombre, this.especie,this.hpmax,this.ppmax);
    }
    @Override
    public void setEspecie(String especie){
        this.especie = especie;
    }
    @Override
    public void setPpmax(int ppmax){
        this.ppmax = ppmax;
    }
    @Override
    public void setHpmax(int hpmax){
        this.hpmax = hpmax;
    }

}
