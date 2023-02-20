import ProtoClass.MatherUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MatherUnit> redHero = new ArrayList<>();
        ArrayList<MatherUnit> blueHero = new ArrayList<>();
        ArrayList<MatherUnit> allHero = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 3);
            switch (a) {
                case 0:
                    redHero.add(new Bandit(getName(), 0, 0));
                    break;
                case 1:
                    redHero.add(new Fermer(getName(), 0, 0));
                    break;
                case 2:
                    redHero.add(new Magician(getName(), 0, 0));
                    break;
                case 3:
                    redHero.add(new Sniper(getName(), 0, 0));
                    break;
            }
        }
        for(int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 3);
            switch (a) {
                case 0:
                    blueHero.add(new Fermer(getName(), 0, 0));
                    break;
                case 1:
                    blueHero.add(new Monk(getName(), 0, 0));
                    break;
                case 2:
                    blueHero.add(new Spearman(getName(), 0, 0));
                    break;
                case 3:
                    blueHero.add(new XbowMan(getName(), 0, 0));
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
            System.out.println(allHero.get(p).getPrint());
        }
    }
    private static String getName(){
        String name = String.valueOf(Name.values()[new Random().nextInt(Name.values().length-1)]);
        return name;
    }

}
