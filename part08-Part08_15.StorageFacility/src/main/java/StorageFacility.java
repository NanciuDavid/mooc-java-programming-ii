import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String , ArrayList<String>> storage = new HashMap<>();

    public StorageFacility(){
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String>contents (String storageUnit) {
        if(this.storage.containsKey(storageUnit)){
        return this.storage.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item);
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> names = new ArrayList<>();
        for(String key:storage.keySet()) {
            names.add(key);
        }
        return names;
    }

}
