package ProtoClass;

public class Vector2D {
    public int x;
    public int y;
    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    protected Double getDistance(Vector2D enemy){
//        return Math.sqrt((x - enemy.x)^2 + (y - enemy.y)^2);
//    }
    protected double getDistance(Vector2D oponent){
        return Math.sqrt(Math.pow(x - oponent.x,2) + Math.pow(y - oponent.y,2));
    }
}


