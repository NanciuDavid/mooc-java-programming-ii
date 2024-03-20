

public class Main {

    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));
        
        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

        OneItemBox box = new OneItemBox();
box.add(new Item("Saludo", 5));
box.add(new Item("Pirkka", 5));

System.out.println(box.isInBox(new Item("Saludo")));
System.out.println(box.isInBox(new Item("Pirkka")));

MisplacingBox boxM = new MisplacingBox();
boxM.add(new Item("Saludo", 5));
boxM.add(new Item("Pirkka", 5));

System.out.println(boxM.isInBox(new Item("Saludo")));
System.out.println(boxM.isInBox(new Item("Pirkka")));
    }
}
