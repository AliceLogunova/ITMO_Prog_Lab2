package Moves.zygarde;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
        public Facade( double pow, double acc){
            super(Type.NORMAL, pow, acc);
        }
        @Override
        protected void applySelfEffects(Pokemon p){
            super.applySelfEffects(p);

            Status cond = p.getCondition();
            if (cond == Status.BURN || cond == Status.PARALYZE || cond == Status.POISON){
                Effect eff = new Effect().stat(Stat.ATTACK, 70);
                p.addEffect(eff);
            }
        }

        @Override
        protected String describe(){
            String[] AttackName = this.getClass().toString().split("\\.");
            return "does " + AttackName[AttackName.length - 1];
        }
}
