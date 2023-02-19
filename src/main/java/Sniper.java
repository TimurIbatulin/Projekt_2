import ProtoClass.Shooter;

public class Sniper extends Shooter {
    public Sniper(String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, int shot) {
        super(name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y, shot);
    }
    public Sniper(String name, int x, int y) {
        super(name, 12, 10, 8, 10, 15, 15, 9, x, y, 32);
        super.name = name;
        super.x = x;
        super.y = y;
    }
    @Override
    public String getInfo(){
        return  "Я снайпер!";
    }
}
