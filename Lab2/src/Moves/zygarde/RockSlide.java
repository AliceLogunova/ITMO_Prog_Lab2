package Moves.zygarde;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {

    public RockSlide( double pow, double acc){
        super(Type.ROCK, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Math.random() < 0.3) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        String[] AttackName = this.getClass().toString().split("\\.");
        return "does " + AttackName[AttackName.length - 1];
    }
}
