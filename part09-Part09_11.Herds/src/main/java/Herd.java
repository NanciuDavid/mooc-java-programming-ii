import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> arrayOfMovables = new ArrayList<>();

    public void addToHerd(Movable movable) {
        this.arrayOfMovables.add(movable);
    }

    @Override
    public void move(int dx, int dy){
        for(int i = 0 ; i < this.arrayOfMovables.size() ; i++) {
            this.arrayOfMovables.get(i).move(dx, dy);
        }
    }


    @Override 
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < this.arrayOfMovables.size(); i++) {
            sb.append(arrayOfMovables.get(i).toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}
