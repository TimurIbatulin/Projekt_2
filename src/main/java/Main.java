import ProtoClass.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MatherUnit> redHero = new ArrayList<>();
        ArrayList<MatherUnit> blueHero = new ArrayList<>();
        ArrayList<MatherUnit> allHero = new ArrayList<>();
        int x = 1;
        int y = 1;

        for(int i = 0; i < 10; i++) {
            y++;
            int a = (int) (Math.random() * 3);
            switch (a) {
                case 0:
                    redHero.add(new Bandit(getName(), x, y, redHero, blueHero));
                    break;
                case 1:
                    redHero.add(new Fermer(getName(), x, y, redHero, blueHero));
                    break;
                case 2:
                    redHero.add(new Magician(getName(), x, y, redHero, blueHero));
                    break;
                case 3:
                    redHero.add(new Sniper(getName(), x, y, redHero, blueHero));
                    break;
            }

        }
        int x1 = 10;
        int y1 = 1;
        for(int i = 0; i < 10; i++) {
            y1++;
            int a = (int) (Math.random() * 3);
            switch (a) {
                case 0:
                    blueHero.add(new Fermer(getName(), x1, y1, blueHero, redHero));
                    break;
                case 1:
                    blueHero.add(new Monk(getName(), x1, y1, blueHero, redHero));
                    break;
                case 2:
                    blueHero.add(new Spearman(getName(), x1, y1, blueHero, redHero));
                    break;
                case 3:
                    blueHero.add(new XbowMan(getName(), x1, y1, blueHero, redHero));
                    break;
            }
        }


        for(int i = 0; i<blueHero.size(); i++){
            allHero.add(blueHero.get(i));
        }
        for(int i = 0; i<redHero.size(); i++){
            allHero.add(redHero.get(i));
        }
        allHero.sort(new Comparator<MatherUnit>() {
            @Override
            public int compare(MatherUnit t1, MatherUnit t2) {
                if (t1.getSpeed() == t2.getSpeed()){
                    return t2.getHp() - t1.getHp();
                }
                return t2.getSpeed() - t1.getSpeed();
            }
        });
        for (int p = 0; p < allHero.size(); p++) {
//            allHero.get(p).step(allHero.get(p), blueHero, redHero);
            System.out.println(allHero.get(p).getEnemyTeam());
        }
//        redHero.get(1).step(redHero, blueHero);
    }

    private static String getName(){
        String name = String.valueOf(Name.values()[new Random().nextInt(Name.values().length-1)]);
        return name;
    }


}
