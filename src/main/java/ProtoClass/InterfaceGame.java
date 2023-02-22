package ProtoClass;

import java.util.ArrayList;

public interface InterfaceGame {
    void step();
    String getInfo();
    int getAttack();
    String getName();
    int getShot();
    String getPrint();
    int getHp();
    int getSpeed();
    ArrayList<MatherUnit> getEnemyTeam();



}
