package ProtoClass;

import ProtoClass.MatherUnit;

import java.util.ArrayList;

import static ProtoClass.Vector2D.SelectionEnemy;

public abstract class Shooter extends MatherUnit {
    int shot;


    public Shooter(String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam, int shot) {
        super(name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y, myTeam, enemyTeam);
        this.shot = shot;
    }

    @Override
    public int getShot(){ return shot;}

    @Override
    public void step() {
        if (getHp()>0){
            if (getShot()>0){
                System.out.println("Сейчас кого-нибудь найду и как тресну!");
                int victim = SelectionEnemy(pos.x, pos.y, enemyTeam;
                enemyTeam.get(victim).getHp() -= getAttack();

            }
        }
    }

}
