package Pokemons;

import Moves.zygarde.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zygarde extends Pokemon {
    public Zygarde(String name, int level) {
        super(name, level);

        super.setType(Type.DRAGON, Type.GROUND);
        super.setStats(108, 100, 120, 81 , 95, 95);

        Crunch crunch = new Crunch(80, 100);
        Facade facade = new Facade(70,100);
        RockSlide rockSlide = new RockSlide(75,90);
        Bulldoze bulldoze = new Bulldoze(60,100);
        super.setMove(crunch, facade, rockSlide, bulldoze);
    }
}
