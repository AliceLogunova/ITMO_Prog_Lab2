package Pokemons;

import Moves.vileplume.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vileplume extends Pokemon {
    public Vileplume(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(75, 80, 85, 110, 90, 50);

        DazzlingGleam dazzlingGleam = new DazzlingGleam(80, 100);
        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        GigaDrain gigaDrain = new GigaDrain(80, 100);
        Rest rest = new Rest(0,0);
        super.setMove(dazzlingGleam, doubleTeam, gigaDrain, rest);
        }
    }
