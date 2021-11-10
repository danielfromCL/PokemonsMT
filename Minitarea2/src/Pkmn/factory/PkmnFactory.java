package Pkmn.factory;

import Pkmn.*;

public interface PkmnFactory {

    /**
     * @return Crea un nuevo pokemon de la clase correspondiente al tipo, con su nombre como parametro.
     */
    IPkmn crearPkmn(String nombre);

    void setEspecie(String especie);

    void setHpmax(int hpmax);

    void setPpmax(int ppmax);
}
