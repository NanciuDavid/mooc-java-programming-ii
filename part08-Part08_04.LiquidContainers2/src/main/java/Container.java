public class Container {
    private int capacity;
    private final int maximumCapacity;

    public Container() {
        this.capacity = 0 ;
        this.maximumCapacity = 100;
    }


    public int contains() {
        return this.capacity;
    }

    public void setCapacity(int value) {
        this.capacity = value;
    }
    
    public void add (int amount) {
        if(amount > 0 && this.capacity + amount < this.maximumCapacity){
        this.capacity += amount;  
        } else if (amount > 0  && this.capacity + amount > this.maximumCapacity) {
            this.capacity = this.maximumCapacity;
        }
    }

    public void remove(int amount) {
        if(amount < 0) {
        return;
        } else if(amount > 0 && this.capacity - amount > 0) {
            this.capacity -= amount;
        } else {
            this.capacity = 0;
        }
    }

    public String toString() {
        return contains()+"/"+this.maximumCapacity;
    }

}
