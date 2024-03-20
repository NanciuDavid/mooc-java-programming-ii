import java.util.HashMap;

public class MisplacingBox extends Box{ 


    private HashMap<String, Integer> missplacedBox = new HashMap<>();

    public MisplacingBox(){
        super();
    }

    @Override
    public void add(Item obj) {
        this.missplacedBox.put(obj.getName(), obj.getWeight());
    }

    @Override
    public boolean isInBox(Item obj) {
        return false ; 
    }


}
