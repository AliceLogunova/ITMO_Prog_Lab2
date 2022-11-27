package Pokemons;

import Moves.bibarel.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bibarel extends Pokemon {
    public Bibarel(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL, Type.WATER);
        super.setStats(79, 85, 60, 55 , 60, 70);

        Tackle tackle = new Tackle(40, 100);
        Thunder thunder = new Thunder(110,70);
        Thunderbolt thunderbolt = new Thunderbolt(90,100);
        Waterfall waterfall = new Waterfall(80, 100);
        super.setMove(tackle, thunder, thunderbolt, waterfall);
        }
    }


