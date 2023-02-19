import ProtoClass.MatherUnit;

public class Fermer extends MatherUnit {
    protected int delivery;
    public Fermer(String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, int delivery) {
        super(name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y);
        this.delivery = 1;
    }
    public Fermer(String name, int x, int y) {
        super(name, 1, 1, 1, 1, 1, 1, 3, x, y);
        super.name = name;
        super.x = x;
        super.y = y;
    }
    @Override
    public String getInfo(){
        return  "Я крестьянин!";
    }
}
