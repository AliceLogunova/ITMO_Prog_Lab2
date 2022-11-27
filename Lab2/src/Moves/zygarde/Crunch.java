package Moves.zygarde;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public class Crunch extends PhysicalMove {

    public Crunch( double pow, double acc){
        super(Type.DARK, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect eff = new Effect().chance(0.2).stat(Stat.DEFENSE, -1);
        p.addEffect(eff);
    }

    @Override
    protected String describe(){
        String[] AttackName = this.getClass().toString().split("\\.");
        return "does " + AttackName[AttackName.length - 1];
    }
}
