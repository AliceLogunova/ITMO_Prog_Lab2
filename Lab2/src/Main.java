import Pokemons.*;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;


public class Main {

    // https://pokemondb.net/pokedex/zygarde
    // https://pokemondb.net/pokedex/bidoof
    // https://pokemondb.net/pokedex/bibarel
    // https://pokemondb.net/pokedex/oddish
    // https://pokemondb.net/pokedex/gloom
    // https://pokemondb.net/pokedex/vileplume

    public static void main(String[] args) {
        start();
    }

    private static void start(){
        Battle b = new Battle();

        Bibarel p1 = new Bibarel("LOL", 1);
        Zygarde p2 = new Zygarde("KEK", 1);
        Gloom p3 = new Gloom("CHEBUREK", 1);
        Vileplume p4 = new Vileplume("VERA", 1);
        Bidoof p5 = new Bidoof("NADEZHDA", 1);
        Oddish p6 = new Oddish("LUBOV", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}