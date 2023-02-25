package ProtoClass;

import java.util.ArrayList;



public abstract class MatherUnit implements InterfaceGame {
    public String name;
    public ArrayList<MatherUnit> myTeam;
    public ArrayList<MatherUnit> enemyTeam;
    protected int attack, def, damage, maxDamage, hp, maxHp,speed;
    public Vector2D pos;

    public MatherUnit(String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y,ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        this.name = name;
        this.attack = attack;
        this.def = def;
        this.damage = damage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        pos = new Vector2D(x,y);
        this.myTeam = myTeam;
        this.enemyTeam = enemyTeam;
        state = "Stand";
    }


    @Override
    public int getAttack(){return attack;}

    @Override
    public String getName(){return name;}
    @Override
    public ArrayList<MatherUnit> getEnemyTeam(){return enemyTeam;}
    @Override
    public ArrayList<MatherUnit> getMyTeam(){return myTeam;}


    @Override
    public void step(ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam){ }
    protected int findNearest(ArrayList<MatherUnit> enemyTeam){
        double min = 100;
        int index = 0;
        for (int i = 0; i < enemyTeam.size(); i++){
            if (min > pos.getDistance(enemyTeam.get(i).pos) & !enemyTeam.get(i).state.equals("Die")){
                index = i;
                min = pos.getDistance(enemyTeam.get(i).pos);
            }
        }
        return index;
    }
    @Override
    public void getDamage(int damage){
        hp -= damage;
        if (hp > maxHp) hp = maxHp;
        if (hp < 0) state = "Die";
    }


//    @Override
//    public void step() {
//        if (getHp()>0){
//            if (getShot()>0){
//                System.out.println("Сейчас кого-нибудь найду и как тресну!");
//                int victim = SelectionEnemy(pos.x, pos.y, enemyTeam);
//                System.out.println(enemyTeam.get(victim).getHp());
//
//            }
//        }
//    }

//    @Override
//    public void step(MatherUnit, ArrayList<MatherUnit> list1, ArrayList<MatherUnit> list2) {
//       }


    @Override
    public String getInfo(){return "Я человек!";}
    @Override
    public String getPrint(){
        return String.format("Имя: %s, Здоровье: %d, Скорость: %d, X: %d, Y:%d", name, hp, speed, pos.x, pos.y);
    }
    @Override
    public int getHp(){return hp;}
    @Override
    public int getSpeed(){return speed;}

    public String state;
}

