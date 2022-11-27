package Moves.gloom;

import ru.ifmo.se.pokemon.*;

public class GigaDrain extends SpecialMove {
    public GigaDrain(double pow, double acc) {
        super(Type.GRASS, pow, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        int HPlevel = (int) (100 - p.getHP());
        Effect eff = new Effect().stat(Stat.HP, (int) (0.5 * HPlevel));
        p.addEffect(eff);
    }


    @Override
    protected String describe(){
        String[] AttackName = this.getClass().toString().split("\\.");
        return "does " + AttackName[AttackName.length - 1];
    }
}
