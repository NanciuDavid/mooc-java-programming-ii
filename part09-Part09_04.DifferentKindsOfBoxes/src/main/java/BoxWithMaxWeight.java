import java.util.ArrayList;
import java.util.HashMap;
public class BoxWithMaxWeight extends Box {
    private HashMap<String, Integer> boxContainer = new HashMap<>();
    private int capacity;
    public BoxWithMaxWeight(int capacity) {
        super();
        this.capacity = capacity;
    }

    public boolean isInBox(Item obj) {
        if(this.boxContainer.keySet().contains(obj.getName())) {
            return true;
        }
        return false;
    }

    public void add(Item obj) {
        
        if(this.capacity >= obj.getWeight()) {
            this.capacity -= obj.getWeight();
            this.boxContainer.put(obj.getName(), obj.getWeight());
        }

    }
}
