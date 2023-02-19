import ProtoClass.MatherUnit;

public class Spearman extends MatherUnit {
    public Spearman(String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y) {
        super(name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y);
    }
    public Spearman(String name, int x, int y) {
        super(name, 4, 5, 1, 3, 10, 10, 4, x, y);
        super.name = name;
        super.x = x;
        super.y = y;
    }
    @Override
    public String getInfo(){
        return  "Я копейщик!";
    }
}
