package ProtoClass;

import java.util.ArrayList;

public class Vector2D {
    public int x;
    public int y;
    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected Double getDistance(Vector2D enemy){
        return Math.sqrt((x - enemy.x)^2 + (y - enemy.y)^2);
    }
//    public static int SelectionEnemy(int x, int y, ArrayList<MatherUnit>list) {
//        int min = 0;
//        int position = 0;
//        for (int r = 0; r < list.size(); r++){
//            int dist = (int) Math.sqrt((x - list.get(r).pos.x) ^ 2 + (y - list.get(r).pos.y) ^ 2);
//            if (min == 0 || dist < min){
//                min = dist;
//                position = r;
//                }
//
//        }
//        return position;
//    }

}


