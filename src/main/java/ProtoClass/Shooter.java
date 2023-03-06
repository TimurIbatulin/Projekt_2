package ProtoClass;

import java.util.ArrayList;



public abstract class Shooter extends MatherUnit {
    int shot;


    public Shooter(String clas, String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam, int shot) {
        super(clas, name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y, myTeam, enemyTeam);
        super.damage = damage;
        this.shot = shot;
    }

    @Override
    public void step(MatherUnit hero, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        if (hero.state.equals("Die") || shot == 0) return;
        int target = findNearest(enemyTeam);
        if (target < 10){
            int dam = (enemyTeam.get(target).def - attack > 0) ? damage : (enemyTeam.get(target).def - attack < 0) ? maxDamage : ((maxDamage + damage) / 2);
            //        System.out.println(dam);
            enemyTeam.get(target).getDamage(dam);
            for (int i = 0; i < myTeam.size(); i++) {
                if (myTeam.get(i).getClass() == Fermer.class && myTeam.get(i).state.equals("Stande")) {
                    myTeam.get(i).state = "Buse";
                    return;
                }
            }
            shot--;
        }

    }
    protected boolean findFarmer(ArrayList<MatherUnit> myTeam) {
        ArrayList<MatherUnit> arrayFermer = new ArrayList<>();
        for (int i = 0; i < myTeam.size(); i++){
            if (myTeam.get(i).getClass() == Fermer.class){
                if (((Fermer) myTeam.get(i)).delivery > 0) {
                    arrayFermer.add(myTeam.get(i));
                }
            }
        }
        switch (arrayFermer.size()) {
            case (0):
                return false;
            case (1):
                ((Fermer) arrayFermer.get(0)).setDelivery(0);
                return true;
            default:
                ((Fermer) arrayFermer.get(findNearest(arrayFermer))).setDelivery(0);
                return true;
        }
    }
//    @Override
//    public String getPrint(){
//        return String.format("Класс: %11s| Имя: %12s| Здоровье: %3d| Скорость: %3d| X: %3d| Y:%3d| Состояние: %5s, Стрелы: %d", clas, name, hp, speed, pos.x, pos.y, state, shot);
//    }
    @Override
    public String getPrint(){
        return String.format("%10s HP: %3d State: %5s  Sh: %2s", clas, hp, state, shot);
    }

}
