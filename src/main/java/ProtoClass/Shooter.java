package ProtoClass;

import ProtoClass.MatherUnit;

public abstract class Shooter extends MatherUnit {
    int shot;


    public Shooter(String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, int shot) {
        super(name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y);
        this.shot = shot;
    }
}
