package ProtoClass;

import java.util.ArrayList;



public abstract class MatherUnit implements InterfaceGame {
    public String name, clas;
    public ArrayList<MatherUnit> myTeam;
    public ArrayList<MatherUnit> enemyTeam;
    protected int attack, def, damage, maxDamage, hp, maxHp,speed;
    public Vector2D pos;

    public MatherUnit(String clas, String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        this.clas = clas;
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


    public ArrayList<MatherUnit> getEnemyTeam(){return enemyTeam;}
    public ArrayList<MatherUnit> getMyTeam(){return myTeam;}
    public int getSpeed(){return speed;}
    public  int getHp(){return hp;}
    public int[] getPos(){return new int[]{pos.x, pos.y};}

    @Override
    public void step(MatherUnit hero, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam){ }
    protected int findNearest(ArrayList<MatherUnit> enemyTeam){
        double min = 10000000;
        int index = 10;
        for (int i = 0; i < enemyTeam.size(); i++){
            if (enemyTeam.get(i).getHp()>0) {
                if ((min > pos.getDistance(enemyTeam.get(i).pos))) {
                    index = i;
                    min = pos.getDistance(enemyTeam.get(i).pos);
                }
            }
        }
//        System.out.println(index);
//        System.out.println(enemyTeam.get(index).getPrint());
        return index;
    }

    protected int help(ArrayList<MatherUnit> myTeam){
        int h = 50;
        int index = 0;
        for (int i = 0; i < myTeam.size(); i++){
            if (myTeam.get(i).getHp()<=0){
                myTeam.get(i).state = "Die";
            }
            if (myTeam.get(i).getHp() < myTeam.get(i).maxHp & myTeam.get(i).getHp() > 0 ){
                h = myTeam.get(i).getHp();
                index = i;
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


    public String getInfo(){return "Я человек!";}

    public String getPrint(){
        return String.format("%10s HP:%3d State: %5s %7s", clas, hp, state, "");
    }
//    public String getPrint(){
//        return String.format("Класс: %11s| Имя: %12s| Здоровье: %3d| Скорость: %3d| X: %3d| Y:%3d| Состояние: %s", clas, name, hp, speed, pos.x, pos.y, state);
//    }

    public String state;
}

