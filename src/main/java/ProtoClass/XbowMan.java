package ProtoClass;

import java.util.ArrayList;

public class XbowMan extends Shooter {
    public XbowMan(String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam, int shot) {
        super(name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y, myTeam, enemyTeam, shot);
    }
    public XbowMan(String name, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        super(name, 6, 3, 2, 3, 10, 10, 4, x, y, myTeam, enemyTeam, 16);
        super.name = name;
        pos = new Vector2D(x,y);
    }
    @Override
    public String getInfo(){
        return  "Я арболетчик!";
    }
}
