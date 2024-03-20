import java.util.HashMap;

public class OneItemBox extends Box{
    private HashMap<String, Integer> oneItemBox = new HashMap<>();

    public OneItemBox() {
        super();
        this.oneItemBox = new HashMap<>();
    }

    @Override
    public void add(Item obj){  
        if(this.oneItemBox.size() == 0) {
            this.oneItemBox.put(obj.getName(), obj.getWeight());
        }
    }

    @Override
    public boolean isInBox(Item obj) {
    if(this.oneItemBox.keySet().contains(obj.getName()))
        return true;
    return false;
    }

}
