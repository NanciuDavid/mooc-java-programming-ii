import java.util.*;

public class Organism implements Movable {

    private int x ;
    private int y ;

    public Organism(int x, int y) {
        this.x = x; 
        this.y = y;
    }


    @Override
    public void move(int x, int y) {
        this.x+=x;
        this.y+=y;
    }


    public String toString() {
        return "x: "+this.x+"; y: "+this.y;
    }


}
