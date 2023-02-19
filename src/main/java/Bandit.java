import ProtoClass.MatherUnit;

public class Bandit extends MatherUnit {
    protected int theft;

    public Bandit(String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, int theft) {
        super(name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y);
        this.theft = 1;
    }
    public Bandit(String name, int x, int y) {
        super(name, 8, 3, 2, 4, 10, 10, 6, x, y);
        super.name = name;
        super.x = x;
        super.y = y;
    }
    @Override
    public String getInfo(){
        return  "Я бандит!";
        }
}
