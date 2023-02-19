import ProtoClass.Shooter;

public class XbowMan extends Shooter {
    public XbowMan(String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, int shot) {
        super(name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y, shot);
    }
    public XbowMan(String name, int x, int y) {
        super(name, 6, 3, 2, 3, 10, 10, 4, x, y, 16);
        super.name = name;
        super.x = x;
        super.y = y;
    }
    @Override
    public String getInfo(){
        return  "Я арболетчик!";
    }
}
