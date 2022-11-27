package Moves.vileplume;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam(double pow, double acc) {
        super(Type.FAIRY, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
    }

    @Override
    protected String describe(){
        String[] AttackName = this.getClass().toString().split("\\.");
        return "does " + AttackName[AttackName.length - 1];
    }
}
