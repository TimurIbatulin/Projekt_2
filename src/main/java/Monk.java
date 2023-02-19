import ProtoClass.MatherUnit;

public class Monk extends MatherUnit {
   protected int magik;

    public Monk(String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int magik, int x, int y) {
        super(name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y);
        this.magik = 1;
    }

    public Monk(String name, int x, int y) {
        super(name, 12, 7, -4, -4, 30, 30, 5, x, y);
        super.name = name;
        super.x = x;
        super.y = y;
    }
    @Override
    public String getInfo(){
        return  "Я монах!";
    }
}

