package Pokemons;

import Moves.oddish.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oddish extends Pokemon {
    public Oddish(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(45, 50, 55, 75, 65, 30);

        DazzlingGleam dazzlingGleam = new DazzlingGleam(80, 100);
        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        super.setMove(dazzlingGleam, doubleTeam);
    }
}



