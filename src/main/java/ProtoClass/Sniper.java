package ProtoClass;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(String clas, String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam, int shot) {
        super(clas, name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y, myTeam, enemyTeam, shot);
    }
    public Sniper(String name, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        super("Лучник", name, 12, 10, 8, 10, 15, 15, 9, x, y, myTeam,  enemyTeam, 32);
        super.name = name;
        pos = new Vector2D(x,y);
    }
    @Override
    public String getInfo(){
        return  "Я снайпер!";
    }


}
