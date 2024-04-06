import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer>productsPrice;
    private Map<String, Integer>productsStock;


    public Warehouse() {
        this.productsPrice = new HashMap<>();
        this.productsStock = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock) {
        this.productsPrice.put(product, price);
        this.productsStock.put(product, stock);
    }

    public int price(String product) {
        if(this.productsPrice.containsKey(product)) {
            return this.productsPrice.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if(this.productsStock.containsKey(product)) {
            return this.productsStock.get(product);
        } else {
            return 0;
        }
    } 

    public boolean take(String product) {
        if(this.productsStock.containsKey(product) == false) {
            return false;
        }
        int stock =  this.productsStock.get(product);
        if(stock - 1 >= 0 ) {
            stock --;
            this.productsStock.put(product, stock);
            return true;
        }   
        if(stock == 0 ) {
            return false;
        }
        return false;
    }

    public Set<String>products() {
        Set<String> names = new HashSet<>();
        for(String key : this.productsStock.keySet()) {
            names.add(key);
        } 
        return names;
    }

}
