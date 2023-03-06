import ProtoClass.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static ArrayList<MatherUnit> redHero = new ArrayList<>();
    public static ArrayList<MatherUnit> blueHero = new ArrayList<>();
    public static ArrayList<MatherUnit> allHero = new ArrayList<>();

    public static void main(String[] args) {
//        ArrayList<MatherUnit> redHero = new ArrayList<>();
//        ArrayList<MatherUnit> blueHero = new ArrayList<>();
//        ArrayList<MatherUnit> allHero = new ArrayList<>();
        Scanner user_input = new Scanner(System.in);
        System.out.println("Pres Enter to begin.");
        createMyTeam(redHero, blueHero);
        createEnemyTeam(blueHero, redHero);
        creatAllTeem(allHero, redHero, blueHero);
        sortTeam(allHero);

        while (true){
            View.view();
            user_input.nextLine();
            for (MatherUnit human: allHero) {
                if (redHero.contains(human)) human.step(human, redHero, blueHero);
                else human.step(human, blueHero, redHero);
            }
        }

//        for (MatherUnit human: allHero) {
//            human.step(human.getMyTeam(), human.getEnemyTeam());
//            System.out.println(human.getPrint());
//        }
//        while (true){
//            for (MatherUnit human: allHero) {
//                human.step(human, human.getMyTeam(), human.getEnemyTeam());
//                System.out.println(human.getPrint());
//            }
//            user_input.nextLine();
//        }


    }
    //______________
    static void createMyTeam(ArrayList team, ArrayList team2) {
        int x = 1;
        int y = 1;
        for (int i = 0; i < 10; i++) {
            y++;
            int a = (int) (Math.random() * 4);
            switch (a) {
                case 0:
                    team.add(new Bandit(getName(), x, y, team, team2));
                    break;
                case 1:
                    team.add(new Fermer(getName(), x, y, team, team2));
                    break;
                case 2:
                    team.add(new Magician(getName(), x, y, team, team2));
                    break;
                case 3:
                    team.add(new Sniper(getName(), x, y, team, team2));
                    break;
            }

        }
    }
    static void createEnemyTeam (ArrayList team, ArrayList team2) {
        int x1 = 10;
        int y1 = 1;
        for (int i = 0; i < 10; i++) {
            y1++;
            int a = (int) (Math.random() * 4);
            switch (a) {
                case 0:
                    team.add(new Fermer(getName(), x1, y1, team, team2));
                    break;
                case 1:
                    team.add(new Monk(getName(), x1, y1, team, team2));
                    break;
                case 2:
                    team.add(new Spearman(getName(), x1, y1, team, team2));
                    break;
                case 3:
                    team.add(new XbowMan(getName(), x1, y1, team, team2));
                    break;
            }
        }
    }

    static void creatAllTeem (ArrayList team, ArrayList team2, ArrayList team3) {
        for (int i = 0; i < team2.size(); i++) {
            team.add(team2.get(i));
        }
        for (int i = 0; i < team3.size(); i++) {
            team.add(team3.get(i));
        }
    }
    static void sortTeam (ArrayList<MatherUnit> team) {
        team.sort(new Comparator<MatherUnit>() {
            @Override
            public int compare(MatherUnit t1, MatherUnit t2) {
                if (t1.getSpeed() == t2.getSpeed()) {
                    return t2.getHp() - t1.getHp();
                }
                return t2.getSpeed() - t1.getSpeed();
            }
        });
    }



    private static String getName(){
        String name = String.valueOf(Name.values()[new Random().nextInt(Name.values().length-1)]);
        return name;
    }

}
