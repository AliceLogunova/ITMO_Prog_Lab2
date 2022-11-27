package Moves.zygarde;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze( double pow, double acc) {
        super(Type.GROUND, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect eff = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(eff);
    }


    @Override
    protected String describe(){
        String[] AttackName = this.getClass().toString().split("\\.");
        return "does " + AttackName[AttackName.length - 1];
    }
}
