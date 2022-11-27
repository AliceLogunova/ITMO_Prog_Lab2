package Moves.vileplume;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        int HPlevel = (int)(100 - p.getHP());
        Effect eff = new Effect().stat(Stat.HP, HPlevel);
        p.addEffect(eff);
    }

    @Override
    protected String describe(){
        String[] AttackName = this.getClass().toString().split("\\.");
        return "does " + AttackName[AttackName.length - 1];
    }
}

