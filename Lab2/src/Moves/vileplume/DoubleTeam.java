package Moves.vileplume;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect eff = new Effect().stat(Stat.ATTACK, -1).stat(Stat.EVASION, 1);
        p.addEffect(eff);
    }

    @Override
    protected String describe(){
        String[] AttackName = this.getClass().toString().split("\\.");
        return "does " + AttackName[AttackName.length - 1];
    }
}




