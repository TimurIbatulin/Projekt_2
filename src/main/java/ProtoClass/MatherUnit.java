package ProtoClass;

public abstract class MatherUnit implements InterfaceGame {
    public String name;
    protected int attack, def, damage, maxDamage, hp, maxHp,speed;
    public int x;
    public int y;

    public MatherUnit(String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y) {
        this.name = name;
        this.attack = attack;
        this.def = def;
        this.damage = damage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    @Override
    public String getName(){return name;}

    @Override
    public void step(){}

    @Override
    public String getInfo(){return "Я человек!";}
    @Override
    public String getPrint(){
        return String.format("Имя: %s, Здоровье: %d, Скорость: %d", name, hp, speed);
    }
    @Override
    public int getHp(){return hp;}
    @Override
    public int getSpeed(){return speed;}

}

