
public class Main {

    public static void main(String[] args){
    A counter = new A();
    B superCounter = new B();
    int number = 3;
    number = superCounter.subtractFromNumber(number);
    number = superCounter.subtractFromNumber(number);
    number = counter.addToNumber(number);
    System.out.println(number);
}
    }

