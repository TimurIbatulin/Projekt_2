import ProtoClass.MatherUnit;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MatherUnit> hero = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 7);
            switch (a) {
                case 0:
                    hero.add(new Bandit(getName(), 0, 0));
                    break;
                case 1:
                    hero.add(new Fermer(getName(), 0, 0));
                    break;
                case 2:
                    hero.add(new Magician(getName(), 0, 0));
                    break;
                case 3:
                    hero.add(new Monk(getName(), 0, 0));
                    break;
                case 4:
                    hero.add(new Sniper(getName(), 0, 0));
                    break;
                case 5:
                    hero.add(new Spearman(getName(), 0, 0));
                    break;
                case 6:
                    hero.add(new XbowMan(getName(), 0, 0));
                    break;
            }
        }
        for (int p = 0; p < 10; p++) System.out.println(hero.get(p).getInfo());
    }
    private static String getName(){
        String name = String.valueOf(Name.values()[new Random().nextInt(Name.values().length-1)]);
        return name;
    }

}wwwww
