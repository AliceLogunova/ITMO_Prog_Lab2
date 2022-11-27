package Pokemons;

import Moves.bidoof.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bidoof extends Pokemon {

    public Bidoof(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(59, 45, 40, 35 , 40, 41);

        Tackle tackle = new Tackle(40, 100);
        Thunder thunder = new Thunder(110,70);
        Thunderbolt thunderbolt = new Thunderbolt(90,100);
        super.setMove(tackle, thunder, thunderbolt);
    }
}
