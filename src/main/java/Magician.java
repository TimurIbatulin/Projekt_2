import ProtoClass.MatherUnit;

public class Magician extends MatherUnit {
    protected int magik;

    public Magician(String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, int magik) {
        super(name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y);
        this.magik = 1;
    }
    public Magician(String name, int x, int y) {
        super(name, 17, 12, -5, -5, 30, 30, 4, x, y);
        super.name = name;
        super.x = x;
        super.y = y;
    }
    @Override
    public String getInfo(){
        return  "Я маг!";
    }
}
