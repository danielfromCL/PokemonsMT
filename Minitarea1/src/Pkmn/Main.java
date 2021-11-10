package Pkmn;
public class Main{

    /**
     * Muestra cuanto de vida tiene cada pokemón y sus nombres.
     */
    static void turno(Pokemon p1, Pokemon p2){
        System.out.println("---------------------------------------");
        System.out.println(p1.getNombre() + " ataca a " + p2.getNombre());
        System.out.println("Salud de " + p1.getNombre() + " es: " + p1.getPuntos());
        System.out.println("Salud de " + p2.getNombre() + " es: " + p2.getPuntos());
    }


    /**
     * Simula la batalla pokemón.
     */
    static void batalla(Pokemon p1, Pokemon p2){
        System.out.println("La batalla está por comenzar...");
        System.out.println("El primer contrincante es " + p1.getNombre()+ "; de la especie " +p1.getEspecie()+ "; del tipo "+p1.getTipo()+"; con puntos de vida inicial "+p1.getPuntos());
        System.out.println("El segundo contrincante es " + p2.getNombre()+ "; de la especie " +p2.getEspecie()+ "; del tipo "+p2.getTipo()+"; con puntos de vida inicial "+p2.getPuntos());


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
        FuegoPkmn Charizard = new FuegoPkmn("Charito","Charizard",50);
        AguaPkmn Gyarados = new AguaPkmn("Gyo","Gyarados",30);
        PlantaPkmn Torterra = new PlantaPkmn("Tortito", "Torterra", 40);
        FuegoPkmn Moltres = new FuegoPkmn("FireChicken", "Moltres", 60);
        AguaPkmn Feraligatr = new AguaPkmn("Fofi","Feraligatr",60);
        PlantaPkmn Bulbasaur = new PlantaPkmn("Bulbito", "Bulbasaur",100);
        FuegoPkmn Charizard2 = new FuegoPkmn("Chorozard","Charizard",5);
        System.out.println("Primera batalla:");
        batalla(Charizard, Gyarados);
        System.out.println("Segunda batalla:");
        batalla(Charizard, Charizard2); //Charito pierde instantaneamente porque perdió la anterior
        System.out.println("Tercera batalla:");
        batalla(Torterra, Feraligatr);
        System.out.println("Cuarta batalla:");
        batalla(Bulbasaur, Moltres);
        System.out.println("Quinta batalla:");
        batalla(Gyarados, Charizard2);
    }
}