package ProtoClass;

import java.util.ArrayList;

public interface InterfaceGame {
    void step(MatherUnit hero, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam);
    void getDamage(int damage);

}
