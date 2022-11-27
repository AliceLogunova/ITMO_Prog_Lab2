package Pokemons;

import Moves.gloom.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gloom extends Pokemon {
    public Gloom(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(60, 65, 70, 85, 75, 40);

        DazzlingGleam dazzlingGleam = new DazzlingGleam(80, 100);
        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        GigaDrain gigaDrain = new GigaDrain(80, 100);
        super.setMove(dazzlingGleam, doubleTeam, gigaDrain);
    }
}
