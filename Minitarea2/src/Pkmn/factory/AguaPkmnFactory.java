package Pkmn.factory;

import Pkmn.IPkmn;
import Pkmn.tipo.AguaPkmn;

/**
 * Factory que crea objetos de AguaPkmn.
 */
public class AguaPkmnFactory implements PkmnFactory{

    String especie;
    int hpmax;
    int ppmax;
    /**
     * Construye una fábrica de AguaPkmns.
     * Tiene como parametro predeterminado una especie generica.
     * Todos los pokemons de tipo agua tienen 45 de hpmax y 15 ppmax (Opté por esto pero además hay setters si la persona lo quiere cambiar para una especie especifica).
     * También pensé en utilizar un metodo crearPkmn que recibiera todos los parametros especificos, pero preferí no darle tanta libertad al usuario y que tenga que hacerlo a través de los setters de la fábrica específica.
     */
    public AguaPkmnFactory() {
        this.especie = "EspecieGenericaAgua";
        this.hpmax = 45;
        this.ppmax = 15;
    }
    /**
     * Crea un AguaPkmn con su nombre.
     * Utiliza los parametros de la fábrica para los demás stats.
     */
    @Override
    public IPkmn crearPkmn(String nombre) {
        return new AguaPkmn(nombre,this.especie,this.hpmax,this.ppmax);
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
