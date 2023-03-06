package ProtoClass;

import java.util.ArrayList;

public class Monk extends MatherUnit {
   protected int magik;

    public Monk(String clas, String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int magik, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        super(clas, name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y, myTeam, enemyTeam);
        this.magik = 1;
    }

    public Monk(String name, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        super("Монах", name, 12, 7, -4, -4, 30, 30, 5, x, y, myTeam, enemyTeam);
        super.name = name;
        pos = new Vector2D(x,y);
    }
    @Override
    public void step(MatherUnit hero, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        if (hero.state.equals("Die")) return;
        int target = help(myTeam);
        int dam = (myTeam.get(target).def - attack > 0) ? damage : (myTeam.get(target).def - attack < 0) ? maxDamage : ((maxDamage + damage) / 2);
        myTeam.get(target).getDamage(dam);


    }

    @Override
    public String getInfo(){
        return  "Я монах!";
    }
}

