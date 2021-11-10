package Pkmn;
import Pkmn.items.*;
import Pkmn.factory.*;

public class Main{

    /**
     * Muestra cuanto de vida tiene cada pokemón y sus nombres.
     */
    static void turno(IPkmn p1, IPkmn p2){
        System.out.println("---------------------------------------");
        System.out.println(p1.getNombre() + " ataca a " + p2.getNombre());
        System.out.println("PPs de " + p1.getNombre() + " son: " + p1.getPp()+"/"+p1.getPpmax());
        System.out.println("Salud de " + p1.getNombre() + " es: " + p1.getPuntos()+"/"+p1.getHpmax());
        System.out.println("Salud de " + p2.getNombre() + " es: " + p2.getPuntos() + "/"+p2.getHpmax());
    }


    /**
     * Simula la batalla pokemón.
     */
    static void batalla(IPkmn p1, IPkmn p2){
        System.out.println("La batalla está por comenzar...");
        System.out.println("El primer contrincante es " + p1.getNombre()+ "; de la especie " +p1.getEspecie()+ "; del tipo "+p1.getTipo()+"; con HP "+p1.getPuntos()+"/"+p1.getHpmax() +" y  PPs " + p1.getPp()+"/"+ p1.getPpmax());
        System.out.println("El segundo contrincante es " + p2.getNombre()+ "; de la especie " +p2.getEspecie()+ "; del tipo "+p2.getTipo()+"; con con HP "+p2.getPuntos()+"/"+p2.getHpmax() +" y  PPs " + p2.getPp()+"/"+ p2.getPpmax());


        boolean vez = true; //si es true le toca a p1 si es false le toca a p2
        while(p1.siguevivo() && p2.siguevivo()){ //Mientras ambos siguen vivos
            if(vez){ //le toca a p1 atacar
                p1.atacar(p2);
                turno(p1,p2);
                vez = false;
            }
            else { //le toca a p2 atacar
                p2.atacar(p1);
                turno(p2, p1);
                vez = true;
            }
        }
        if(p1.siguevivo()){
            System.out.println(p1.getNombre()+" ha ganado! \n \n");
        }
        else{
            System.out.println(p2.getNombre() + " ha ganado! \n \n" );
        }
    }


    public static void main(String[] args) {
        PkmnFactory pf = new FuegoPkmnFactory();
        PkmnFactory pa = new AguaPkmnFactory();
        PkmnFactory pp = new PlantaPkmnFactory();
        IPkmn GenericAgua = pa.crearPkmn("GenericAgua");
        IPkmn GenericFuego = pf.crearPkmn("GenericFuego");
        IPkmn GenericPlanta = pp.crearPkmn("GenericPlanta");
        pf.setEspecie("Charizard");
        pf.setHpmax(50);
        pf.setPpmax(20);
        IPkmn Charizard = pf.crearPkmn("Charito");
        pf.setHpmax(5);
        IPkmn Charizard2 = pf.crearPkmn("Chorozard");
        pf.setHpmax(60);
        pf.setEspecie("Moltres");
        IPkmn Moltres = pf.crearPkmn("FireChicken");
        pa.setEspecie("Gyarados");
        pa.setHpmax(30);
        pa.setPpmax(20);
        IPkmn Gyarados = pa.crearPkmn("Gyo");
        pa.setHpmax(60);
        pa.setEspecie("Feraligatr");
        IPkmn Feraligatr = pa.crearPkmn("Fofi");
        pp.setHpmax(40);
        pp.setPpmax(25);
        pp.setEspecie("Torterra");
        IPkmn Torterra = pp.crearPkmn("Tortito");
        pp.setHpmax(100);
        pp.setEspecie("Bulbasaur");
        IPkmn Bulbasaur = pp.crearPkmn("Bulbito");
        System.out.println("Sólo hay ethers que recuperan 3 PPs disponibles, y pociones que recuperan 20HP");
        Ether e =  new Ether(3);
        Pocion po = new Pocion(20);
        FullRestore r = new FullRestore();
        System.out.println("Primera batalla:");
        batalla(Charizard, Gyarados);
        System.out.println("HP de "+Gyarados.getNombre() +" después de la batalla: " +Gyarados.getPuntos() +"/"+Gyarados.getHpmax());
        Gyarados.usarItem(po);
        System.out.println(Gyarados.getNombre() +" utiliza poción y queda con : " +Gyarados.getPuntos() +"/"+Gyarados.getHpmax()+ " HP");
        System.out.println("Segunda batalla:");
        batalla(Charizard, Charizard2); //Charito pierde instantaneamente porque perdió la anterior
        //Probamos que no se pase ni el hp maximo ni el pp maximo al usar items.
        System.out.println("HP de "+Charizard2.getNombre() +" después de la batalla: " +Charizard2.getPuntos() +"/"+Charizard2.getHpmax());
        Charizard2.usarItem(po);
        System.out.println(Charizard2.getNombre() +" utiliza poción y queda con : " +Charizard2.getPuntos() +"/"+Charizard2.getHpmax()+ " HP");
        System.out.println("PPs de "+Charizard2.getNombre() +" después de la batalla: " +Charizard2.getPp() +"/"+Charizard2.getPpmax());
        Charizard2.usarItem(e);
        System.out.println(Charizard2.getNombre() +" utiliza ether y queda con : " + Charizard2.getPp() +"/"+Charizard2.getPpmax()+ " PPs");
        Charizard2.usarItem(r);
        System.out.println(Charizard2.getNombre() +" utiliza Full Restore y queda con : " +Charizard2.getPuntos() +"/"+Charizard2.getHpmax()+ " HP y con: " + Charizard2.getPp()+ "/"+ Charizard2.getPpmax()+ " PPs");
        System.out.println("Tercera batalla:");
        batalla(Torterra, Feraligatr);
        System.out.println("PPs de "+Torterra.getNombre() +" después de la batalla: " +Torterra.getPp() +"/"+Torterra.getPpmax());
        Torterra.usarItem(e);
        System.out.println(Torterra.getNombre() +" utiliza ether y queda con : " +Torterra.getPp() +"/"+Torterra.getPpmax()+ " PPs");
        System.out.println("Cuarta batalla:");
        batalla(Bulbasaur, Moltres);
        System.out.println("Quinta batalla:");
        batalla(Gyarados, Charizard2);
        System.out.println("HP de "+Gyarados.getNombre() +" después de la batalla: " +Gyarados.getPuntos() +"/"+Gyarados.getHpmax());
        System.out.println("PPs de "+Gyarados.getNombre() +" después de la batalla: " +Gyarados.getPp() +"/"+Gyarados.getPpmax());
        Gyarados.usarItem(r);
        System.out.println(Gyarados.getNombre() +" utiliza Full Restore y queda con : " +Gyarados.getPuntos() +"/"+Gyarados.getHpmax()+ " HP y con: " + Gyarados.getPp()+ "/"+ Gyarados.getPpmax()+ " PPs");
        System.out.println("Sexta batalla: (batalla entre genéricos de Agua x Planta)");
        batalla(GenericAgua, GenericPlanta);
        System.out.println("Septima batalla: (batalla entre genéricos de Planta x Fuego)");
        batalla(GenericPlanta,GenericFuego);
        System.out.println("Ocatava batalla: (batalla entre genéricos de Fuego x Agua)");
        batalla(GenericFuego, GenericAgua);
    }
}
