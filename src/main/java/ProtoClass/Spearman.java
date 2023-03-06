package ProtoClass;

import java.util.ArrayList;

public class Spearman extends MatherUnit {
    public Spearman(String clas, String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        super(clas, name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y, myTeam, enemyTeam);
    }
    public Spearman(String name, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        super("Копейщик",name, 4, 5, 1, 3, 10, 10, 4, x, y, myTeam, enemyTeam);
        super.name = name;
        pos = new Vector2D(x,y);
    }
    @Override
    public String getInfo(){
        return  "Я копейщик!";
    }
    @Override
    public void step(MatherUnit hero, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        if (hero.state.equals("Die")) return;
        int target = findNearest(enemyTeam);
        if (target < 10){
            if ((hero.pos.y != enemyTeam.get(target).pos.y + 1) | (hero.pos.y != enemyTeam.get(target).pos.y + 1)){
                if ((hero.pos.x != enemyTeam.get(target).pos.x + 1) | (hero.pos.x != enemyTeam.get(target).pos.x + 1)){
                    if (hero.pos.y == enemyTeam.get(target).pos.y){
                        hero.pos.x = hero.pos.x - 1;
                    }
                    if (hero.pos.y < enemyTeam.get(target).pos.y){
                        hero.pos.x = hero.pos.x - 1;
                        hero.pos.y = hero.pos.y + 1;
                    }
                    if (hero.pos.y > enemyTeam.get(target).pos.y){
                        hero.pos.x = hero.pos.x - 1;
                        hero.pos.y = hero.pos.y - 1;
                    }
                }
            }
            else {
                int dam = (enemyTeam.get(target).def - attack > 0) ? damage : (enemyTeam.get(target).def - attack < 0) ? maxDamage : ((maxDamage + damage) / 2);
                enemyTeam.get(target).getDamage(dam);
            }
        }
    }
}
