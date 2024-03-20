import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> hashmap = new HashMap<>();

    public IOU() {
        this.hashmap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        hashmap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        boolean exists = false;
        for(String key : hashmap.keySet()) {
            if(key.equals(toWhom)) {
                exists = true;
            }
        }
        if(exists) 
        return this.hashmap.getOrDefault(toWhom, 0.0);
        else
        return 0.0;
}
}